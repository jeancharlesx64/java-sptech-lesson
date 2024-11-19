
public class AlunoPos extends Aluno{

    private Double notaTcc;

    public AlunoPos(String nome, Double nota1, Double nota2, Double nota3, Double notaTcc) {
        super(nome, nota1, nota2, nota3);
        this.notaTcc = notaTcc;
    }

    @Override
    public Double calcularMedia() {
        return (super.getNota1() + super.getNota2() + super.getNota3() + this.notaTcc) / 4;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "notaTcc=" + notaTcc +
                '}';
    }

    public Double getNotaTcc() {
        return notaTcc;
    }
}
