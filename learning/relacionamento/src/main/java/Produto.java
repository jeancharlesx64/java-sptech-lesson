public class Produto {
    private Integer codigo;
    private String nome;
    private Double precoCompra;

    private Categoria categoria;

    private Usuario usuario;

    public Produto(Integer codigo, String nome, Double precoCompra, Categoria categoria, Usuario usuario ) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.categoria = categoria;
        this.usuario = usuario;

    }

    public Double getPrecoVenda(){
        return this.precoCompra + (this.precoCompra * (categoria.getMargemLucro() / 100));
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
