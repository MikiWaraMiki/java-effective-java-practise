package item34;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation {
    PLUS("+") {
        public double apply(double x, double y ) { return x+y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return  x / y; }
    };

    private final String symbol;

    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).collect(
                    Collectors.toMap(Objects::toString, e -> e)
            );

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

    static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public abstract double apply(double x, double y);
}