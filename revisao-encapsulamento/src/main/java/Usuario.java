import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Usuario {
    private String nome;
    private String email;
    private String cpf;
    private String dataNasc;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = String.valueOf(LocalDate.parse(dataNasc));
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade(){
        LocalDate dataNascFormatted = LocalDate.parse(this.dataNasc);
        Long idade = ChronoUnit.YEARS.between(dataNascFormatted, LocalDate.now());

        return idade.intValue();
    }
}
