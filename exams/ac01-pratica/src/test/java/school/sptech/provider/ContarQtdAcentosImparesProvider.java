package school.sptech.provider;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class ContarQtdAcentosImparesProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext)
          throws Exception {
        return Stream.of(
              Arguments.of(1, 25),
              Arguments.of(2, 19),
              Arguments.of(3, 45),
              Arguments.of(4, 40)
        );
    }
}
