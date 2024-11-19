public enum EstacaoAno {
    PRIMAVERA("Primavera - Estação das flores", 20.0, 24.5),
    VERAO("Verão - Sol de rachar a cuca", 24.51, Double.MAX_VALUE),
    OUTONO("Outono -  cai cai folhiha", 19.99, 15.00),
    INVERNO("Inverno - Frio do diabo sai fora", -50.0, 14.99);

    private final String descricao;
    private final double temperaturaMin;
    private final double temperaturaMax;

    EstacaoAno(String descricao, double temperaturaMin, double temperaturaMax) {
        this.descricao = descricao;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
    }

    public static EstacaoAno fromTemperatura(Double temperatura){
        for(EstacaoAno estacao : values()){
            if(temperatura >= estacao.temperaturaMin && temperatura <= estacao.getTemperaturaMax()){
                return estacao;
            }
        }

        return null;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }
}
