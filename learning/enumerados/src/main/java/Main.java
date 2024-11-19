import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EstacaoAno estacao1 = EstacaoAno.PRIMAVERA;

        System.out.println(estacao1.getDescricao());

        for(EstacaoAno estacaoAno : EstacaoAno.values()){
            System.out.println(estacaoAno.getDescricao());
        }

        System.out.println(estacao1.fromTemperatura(10000.5));;

    }
}
