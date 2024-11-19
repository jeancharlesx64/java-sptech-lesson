import java.util.ArrayList;
import java.util.List;

public class Lutador {
    private String nome;
    private Double peso;

    private List<Luta> lutas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public List<Luta> getLutas() {
        return lutas;
    }

    private Integer getTotalLuta(){
        return lutas.size();
    }

    private Integer getVitorias(){
        int vitorias = 0;


        for(var luta : lutas){
            if(luta.getVencedor() != null && luta.getVencedor().equals(this)){
                vitorias++;
            }
        }

        return vitorias;
    }

    private Integer getDerrotas(){
        int derrotas = 0;

        for(var luta : lutas){
            if(luta.getVencedor() != null && !luta.getVencedor().equals(this)){
                derrotas++;
            }
        }

        return derrotas;

    }

    public Lutador(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    private Integer getEmpates(){
        int empates = 0;

        for(var luta : lutas){
            if(luta.getVencedor() == null){
                empates++;
            }
        }

        return empates;
    }

}
