package sptech;

public class Carro {
    // atributos
    private String modelo;
    private String cor;
    private Integer anoFabricacao;

    private Integer quilometragem = 0;
    private Double combustivel = 0.0;
    private Double capacidadeTanque = 100.0;
    private Integer marcha;



    // construtores
    public Carro(String modelo, String cor, Integer anoFabricacao, Integer marcha) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.marcha = marcha;

        System.out.println("Um novo carro foi criado");
    }

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(){

    }

    // métodos
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAnoFabricacao() {
        if(this.anoFabricacao == null){
            return "Ano de fabricação não foi definida!";
        }
        return anoFabricacao.toString();
    }
    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Double combustivel) {
        this.combustivel = combustivel;
    }

    public Double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }



    public String getMarcha() {
        String marcha = "";

        if(this.marcha == null){
            return "ola";
        }

        if(this.marcha == -2){
             marcha = "P";
        }else if(this.marcha == -1){
            marcha = "Ré";
        }else if(this.marcha == 0){
            marcha = "Neutro";
        }else if(this.marcha >= 1 && this.marcha <= 5){
            marcha = this.marcha.toString();
        }

        return marcha;
    }

    public void aumentarMarcha() {
        if(this.marcha < 5){
            this.marcha += 1;
        }
    }
    public void reduzirMarcha(){
        if(this.marcha > -2){
            this.marcha -= 1;
        }

    }

    public Double getPreco(){
        Double valorIpva = 0.0;

        if(quilometragem >= 0 && quilometragem <= 2000){
            valorIpva = 1000.0;
        }else if(quilometragem >= 2000 && quilometragem <= 10000){
            valorIpva = 700.0;
        } else{
            valorIpva = 500.0;
        }

        return valorIpva;
    }


    public Boolean isReserva(){
        if(this.combustivel < this.capacidadeTanque * (10/100)){
            return false;
        }
        return true;
    }

    public void abastercer(Integer quantidade){
        if(quantidade <= (this.capacidadeTanque - this.combustivel)){
            this.combustivel += quantidade;
        }else{
            System.out.println("Essa quantidade é excessiva!");
            System.out.println("Capacidade máxima de: "+this.capacidadeTanque+"L");
            System.out.println("O tanque precisa de "+(this.capacidadeTanque - this.combustivel)+"L para ser preenchido!");
        }

    }

    public void acelerar(Integer segundos){
        Double gasto = 0.2 * segundos;

        if(this.combustivel - gasto >= 0){
            this.combustivel -= 0.2 * segundos;
        }else{
            System.out.println("Não pode acelerar tanto! irá acabar o combustível");
        }
    }
}
