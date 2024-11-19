public class Main {
    public static void main(String[] args) {


        BilheteUnico bilhete1 = new BilheteUnico();

        bilhete1.nomeTitular = "Jean Charles";
        bilhete1.estudante = true;
        bilhete1.numeroCartao = "11122233396";
        bilhete1.saldo = 0.0;


        bilhete1.recarregar(20.00);


        BilheteUnico bilhete2 = new BilheteUnico();

        bilhete2.nomeTitular = "Fabiana Pereira";
        bilhete2.estudante = false;
        bilhete2.numeroCartao = "96333222111";
        bilhete2.saldo = 0.0;

        System.out.println(bilhete1.saldo);
        System.out.println(bilhete2.saldo);



        bilhete1.passarCartao(false);

        bilhete1.mostrarInformacao();


    }
}
