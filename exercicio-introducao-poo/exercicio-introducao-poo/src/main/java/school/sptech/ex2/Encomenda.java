package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    Double calcularFrete(){
        Double valorFrete;
        Integer percentualTamanho = 0;
        Double valorDistancia;

        switch (this.tamanho){
            case "P":
                percentualTamanho = 1;
                break;
            case "M":
                percentualTamanho = 3;
                break;
            case "G":
                percentualTamanho = 5;
                break;
            default:
                break;
        }

        if(this.distancia <= 50){
            valorDistancia = 3.0;
        }else if(this.distancia <= 200){
            valorDistancia = 5.0;
        }else{
            valorDistancia = 7.0;
        }

        valorFrete = valorDistancia + (this.valorProduto * (percentualTamanho/100.0));
        return valorFrete;
    }

    void aplicarCupomDeDesconto(Integer percentualDesconto){
        this.valorProduto -= this.valorProduto * (percentualDesconto/100.0);
    }

    Double valorTotalDaEncomenda(){
        Double valorFrete = this.calcularFrete();
        return this.valorProduto + valorFrete;
    }
}
