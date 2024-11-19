import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private String endereco;
    private List<String> listaCursos;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaCursos = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<String> cursos) {
        this.listaCursos = cursos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public void matricularAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
    }

    public void exibirAlunos(){
        System.out.println("Alunos da faculdade "+this.getNome());
        for(Aluno aluno : listaAlunos){
            System.out.println("Nome: "+aluno.getNome());
        }
    }

    public void exibirAlunosPos(){
        for(Aluno aluno : listaAlunos){
            if(aluno instanceof AlunoPos){
                System.out.println("Aluno pos: "+aluno.getNome());
            }
        }
    }

    public Double calcularMediaNotasTcc(){
        Integer qtdAlunos = 0;
        Double somaNotas = 0.0;

        for(Aluno aluno : listaAlunos){
            if(aluno instanceof AlunoPos){
                somaNotas += ((AlunoPos) aluno).getNotaTcc();
                qtdAlunos++;
            }
        }

        return somaNotas/qtdAlunos;
    }
}
