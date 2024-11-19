package school.sptech.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CalcularValorIngressoProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext)
          throws Exception {
        return Stream.of(
              Arguments.of(1, false, 30.0),
              Arguments.of(1, true, 15.0),
              Arguments.of(2, false, 35.0),
              Arguments.of(2, true, 17.5),
              Arguments.of(3, false, 40.0),
              Arguments.of(3, true, 20.0),
              Arguments.of(4, false, 45.0),
              Arguments.of(4, true, 22.5)
        );
    }
}
