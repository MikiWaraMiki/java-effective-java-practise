package item10;

import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.util.Comparator;
import static java.util.Comparator.*;

@EqualsAndHashCode
public class PhoneNumber {
    private final short areaCode, prefix, lineNum;
    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 999, "arg");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    public int compareTo(@NonNull PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }
}
