package item5;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.function.Supplier;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InjectAbleLogger {
    Logger logger;


    static InjectAbleLogger create(Supplier<Logger> loggerFactory) {
        return new InjectAbleLogger(
                loggerFactory.get()
        );
    }
}
