import java.util.List;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Jean", "123456");

        Categoria cat1 = new Categoria(1, "Eletrônico", 50.0);
        Categoria cat2 = new Categoria(2, "Móveis", 40.0);
        Categoria cat3 = new Categoria(3, "Frutas", 10.0);

        var prod1 = new Produto(1, "Pilha", 10.0, cat1, usuario1);
        var prod2 = new Produto(2, "Cartão SD", 10.0, cat1,usuario1);
        var prod3 = new Produto(3, "Cadeira de debate", 10.0, cat2, usuario1);
        var prod4 = new Produto(4, "Uva", 10.0, cat3,usuario1);
        var prod5 = new Produto(5, "Maracujá", 7.0, cat3, usuario1);

        List<Produto> produtos = List.of(prod1,prod2,prod3,prod4,prod5);
        produtos.forEach(produto ->{
            System.out.println("""
            CÓDIGO %S
            %s
            Comprado por R$%s
            Categoria [%S]
            Será vendido por R$%s
            Produto cadastrado por %s
            """.formatted(produto.getCodigo(), produto.getNome(),
                    produto.getPrecoCompra(), produto.getCategoria().getNome(),
                    produto.getPrecoVenda(), produto.getUsuario().getLogin()));
        });

    }
}
