package school.sptech;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cinema cinema = new Cinema();


        System.out.println(cinema.calcularPrecoSala(true, false));

    }
}