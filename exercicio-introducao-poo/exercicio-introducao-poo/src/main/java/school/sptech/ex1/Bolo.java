package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer quantidade){
        if(quantidade > 0 && this.quantidadeEmEstoque >= quantidade){
            this.quantidadeVendida += quantidade;
            this.quantidadeEmEstoque -= quantidade;
        }
    }

    void aumentarEstoque(Integer quantidade){
        if(quantidade > 0){
            this.quantidadeEmEstoque += quantidade;
        }
    }

    Integer quantidadeDisponivel(){
        return this.quantidadeEmEstoque;
    }

    Double totalVendido(){
        return this.quantidadeVendida * this.valor;
    }
}
