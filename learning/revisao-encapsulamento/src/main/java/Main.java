import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Jean","jean.albuquerque@sptech.school");

        usuario1.setDataNasc("2005-08-25");
        System.out.println(usuario1.getIdade());
    }
}
