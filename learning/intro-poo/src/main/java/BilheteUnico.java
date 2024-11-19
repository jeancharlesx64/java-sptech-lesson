public class BilheteUnico {
    String nomeTitular;
    Boolean estudante;
    Double saldo;
    String numeroCartao;

    void recarregar(Double valor){
        this.saldo += valor;
    }

    void mostrarInformacao(){
        System.out.println(
                """
                    Nome Titular: %s
                    Estudande: %s
                    N° Cartão: %s
                    Saldo Atual: %s
                """.formatted(
                        this.nomeTitular,
                        this.estudante ? "sim" : "não",
                        this.numeroCartao,
                        this.saldo
                )
        );
    }

    Boolean passarCartao(Boolean integracao){

        if(integracao){
            return true;
        }

        if(this.estudante){
            this.saldo -= 2.20;
            return true;
        }

        if(this.saldo >= 4.40){
            this.saldo -= 4.40;
            return true;
        }

        System.out.println("Saldo insuficiente.");
        return false;
    }
}
