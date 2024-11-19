import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Faculdade faculdade1 = new Faculdade("SPTech", "Haddock Lobo");

        Aluno aluno1 = new Aluno("Jean Charles",10.0, 10.0, 10.0);
        Aluno aluno2 = new Aluno("Samuel baitola", 3.5, 5.0, 4.0);

        Aluno aluno3 = new AlunoPos("Pietro Vagabundo", 8.0,1.0, 2.0, 5.0);
        Aluno aluno4 = new AlunoPos("Vinicius gayzao", 2.0,3.0, 7.0, 8.0);

        Aluno aluno5 = new AlunoCdf("Cecilia CDF", 10.0, 10.0, 10.0);

        faculdade1.matricularAluno(aluno1);
        faculdade1.matricularAluno(aluno2);
        faculdade1.matricularAluno(aluno3);
        faculdade1.matricularAluno(aluno4);

        // faculdade1.exibirAlunos();
        // faculdade1.exibirAlunosPos();
        System.out.println(faculdade1.calcularMediaNotasTcc());
    }
}
