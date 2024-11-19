package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer percentual){
        this.salario += this.salario * (percentual/100.0);
    }

    Double calcularValorHora(){
        return this.salario / 220;
    }

    Double calcularHoraExtra(Integer horaExtras, Integer percentualNoturno){
        Double valorHora = this.salario / 220;

        Double valorExtra = valorHora * horaExtras;

        valorExtra += valorExtra*(percentualNoturno/100.0);

        return valorExtra;
    }

}
