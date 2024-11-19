public class AlunoCdf extends Aluno{


    public AlunoCdf(String nome, Double nota1, Double nota2, Double nota3) {
        super(nome, nota1, nota2, nota3);
    }

    @Override
    public Double calcularMedia(){
        return 10.0;
    }

}