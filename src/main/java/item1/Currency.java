package item1;

/**
 * Currency
 */
public enum Currency {
    DOLLAR("USD"),
    FRANC("CHF");

    private final String name;

    Currency(String name) {
        this.name = name;
    }
}
