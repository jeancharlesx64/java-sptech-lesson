import java.util.List;
import java.util.Scanner;

public class AppLuta {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o nome e o peso do Lutador'");

        Lutador lutador1 = new Lutador(
                in.next(),
                in.nextDouble()
        );

        System.out.println("Informe o nome e o peso do Lutador2");

        Lutador lutador2 = new Lutador(
                in.next(),
                in.nextDouble()
        );

        Luta luta1 = new Luta(lutador1, lutador2, lutador1);
        Luta luta2 = new Luta(lutador1, lutador2, lutador1);
        Luta luta3 = new Luta(lutador1, lutador2, lutador2);
        Luta luta4 = new Luta(lutador1, lutador2, lutador2);
        Luta luta5 = new Luta(lutador1, lutador2, lutador2);

        lutador1.getLutas().addAll(List.of(luta1,luta2,luta3,luta4,luta5));
        lutador2.getLutas().addAll(List.of(luta1,luta2,luta3,luta4,luta5));

        System.out.println("""
        Cartel do Lutador %s;
        Peso: %s
        Lutas: %s
        Vitórias: %s
        Empates: %s
        Derrotas: %s
        """.formatted());

    }
}
