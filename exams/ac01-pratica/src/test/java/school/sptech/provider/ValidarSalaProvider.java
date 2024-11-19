package school.sptech.provider;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ValidarSalaProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(-2,false),
                Arguments.of(-1,false),
                Arguments.of(1, true),
                Arguments.of(2, true),
                Arguments.of(3, true),
                Arguments.of(4, true),
                Arguments.of(5, false),
                Arguments.of(6, false),
                Arguments.of(10, false),
                Arguments.of(3000,false),
                Arguments.of(0,false),
                Arguments.of(10000000,false)
        );
    }
}
