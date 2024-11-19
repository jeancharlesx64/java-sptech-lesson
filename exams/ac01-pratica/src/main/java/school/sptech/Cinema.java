package school.sptech;

public class Cinema {
    Boolean validarSala(Integer sala){
        Boolean estaValido = false;

        switch(sala){
            case 1:
                estaValido = true;
                break;
            case 2:
                estaValido = true;
                break;
            case 3:
                estaValido = true;
                break;
            case 4:
                estaValido = true;
                break;
            default:
                estaValido = false;
                break;
        }

        return estaValido;
    }

    Double calcularPrecoSala(Boolean sala3d, Boolean imax){
        Double precoSala = 30.0;

        Double preco3d = 5.0;
        Double precoImax = 10.0;

        if(sala3d){
            precoSala += preco3d;
        }
        if(imax){
            precoSala += precoImax;
        }

        return precoSala;
    }

    Double calcularValorIngresso(Integer sala, Boolean meiaEntrada){

        Double valorIngresso = 0.0;

        Double valorBase = 30.0;
        Double valor3d = 5.0;
        Double valorImax = 10.0;

        switch(sala){
            case 1:
                valorIngresso += valorBase;
                break;
            case 2:
                valorIngresso += valorBase + valor3d;
                break;
            case 3:
                valorIngresso += valorBase + valorImax;
                break;
            case 4:
                valorIngresso += valorBase + valor3d + valorImax;
                break;
            default:
                break;
        }

        if(meiaEntrada){
            valorIngresso = valorIngresso / 2;
        }

        return valorIngresso;
    }

    Integer contarQtdAcentosImpares(Integer sala){
        Integer qtdCadeiras = 0;

        switch(sala){
            case 1:
                qtdCadeiras = 50;
                break;
            case 2:
                qtdCadeiras = 37;
                break;
            case 3:
                qtdCadeiras = 90;
                break;
            case 4:
                qtdCadeiras = 80;
                break;
            default:
                break;
        }

        Integer qtdImpar = 0;

        for(int i = 1; i <= qtdCadeiras; i++){
            if(i % 2 == 1){
                qtdImpar++;
            }
        }

        return  qtdImpar;
    }
}