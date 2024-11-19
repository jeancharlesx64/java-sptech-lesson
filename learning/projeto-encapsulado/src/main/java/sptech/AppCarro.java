package sptech;

public class AppCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Mustang","Azul", 2024, 1);
        Carro carro2 = new Carro("Supra", "Preto");
        Carro carro3 = new Carro();

        Carro carro4 = new Carro("Ferrari", "Vermelho", 2000, 1);



        carro4.abastercer(100);
        carro4.acelerar(5);
        System.out.println(carro4.getCombustivel());

    }
}
