package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import school.sptech.provider.CalcularPrecoSalaProvider;
import school.sptech.provider.CalcularValorIngressoProvider;

import java.lang.reflect.Method;
import school.sptech.provider.ContarQtdAcentosImparesProvider;
import school.sptech.provider.ValidarSalaProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Cinema")
class CinemaTest {

    @Nested
    @DisplayName("validarSala()")
    class ValidarSalaTest {

        @ParameterizedTest
        @DisplayName("Deve validar corretamente a sala")
        @ArgumentsSource(ValidarSalaProvider.class)
        void testValidarSala(Integer sala, Boolean valorEsperado)
              throws ReflectiveOperationException {

            Class<Cinema> clazz = Cinema.class;
            Method method = clazz.getDeclaredMethod("validarSala", Integer.class);

            method.setAccessible(true);

            Cinema obj = new Cinema();
            Boolean salaValida = (Boolean) method.invoke(obj, sala);

            assertEquals(valorEsperado, salaValida);
        }
    }

    @Nested
    @DisplayName("calcularPrecoSala()")
    class CalcularPrecoSalaTest {

        @ParameterizedTest
        @DisplayName("Deve calcular corretamente o preço da sala")
        @ArgumentsSource(CalcularPrecoSalaProvider.class)
        void testCalcularPrecoSala(Boolean sala3d, Boolean imax, Double precoEsperado)
              throws ReflectiveOperationException {

            Class<Cinema> clazz = Cinema.class;
            Method method = clazz.getDeclaredMethod("calcularPrecoSala", Boolean.class,
                  Boolean.class);

            method.setAccessible(true);

            Cinema obj = new Cinema();
            Double preco = (Double) method.invoke(obj, sala3d, imax);

            assertEquals(precoEsperado, preco, 0.01);
        }
    }

    @Nested
    @DisplayName("calcularValorIngresso()")
    class CalcularValorIngressoTest {

        @ParameterizedTest
        @DisplayName("Deve calcular corretamente o valor do ingresso")
        @ArgumentsSource(CalcularValorIngressoProvider.class)
        void testCalcularValorIngresso(Integer sala, Boolean meiaEntrada, Double valorEsperado)
              throws ReflectiveOperationException {

            Class<Cinema> clazz = Cinema.class;
            Method method = clazz.getDeclaredMethod("calcularValorIngresso", Integer.class,
                  Boolean.class);

            method.setAccessible(true);

            Cinema obj = new Cinema();
            Double valorIngresso = (Double) method.invoke(obj, sala, meiaEntrada);

            assertEquals(valorEsperado, valorIngresso, 0.01);
        }
    }

    @Nested
    @DisplayName("contarQtdAcentosImpares()")
    class ContarQtdAcentosImparesTest {

        @ParameterizedTest
        @DisplayName("Deve contar a quantidade de acento impares corretamente")
        @ArgumentsSource(ContarQtdAcentosImparesProvider.class)
        void testQtdAcentosDivisiveisPor3NaSala(Integer sala, Integer valorEsperado)
              throws ReflectiveOperationException {

            Class<Cinema> clazz = Cinema.class;
            Method method = clazz.getDeclaredMethod("contarQtdAcentosImpares",
                  Integer.class);

            method.setAccessible(true);

            Cinema obj = new Cinema();
            Integer qtdAcentosImpares = (Integer) method.invoke(obj, sala);

            assertEquals(valorEsperado, qtdAcentosImpares);
        }
    }
}
