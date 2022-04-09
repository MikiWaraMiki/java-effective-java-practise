package item1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Money {
    Currency currency;
    int amount;

    static Money dollar(int amount) {
        return new Money(Currency.DOLLAR, amount);
    }

    static Money franc(int amount) {
        return  new Money(Currency.FRANC, amount);
    }
}
