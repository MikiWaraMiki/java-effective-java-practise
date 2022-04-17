package item17;

import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    @Nested
    class PlusTest {
        @Test
        @DisplayName("2-2i + 1-1i = 3-3i")
        void testSimplePlus() {
            val complex = Complex.valueOf(2, -2);
            val addend = Complex.valueOf(1, -1);

            val result = complex.plus(addend);

            val expected = Complex.valueOf(3, -3);

            assertEquals(expected, result);
        }
    }

    @Nested
    class MinusTest {
        @Test
        @DisplayName("2-2i - 1-1i = 1-1i")
        void testSimpleMinus() {
            val complex = Complex.valueOf(2, -2);
            val target = Complex.valueOf(1, -1);

            val result = complex.minus(target);

            val expected = Complex.valueOf(1, -1);

            assertEquals(expected, result);
        }
    }

    @Nested
    class TimesTest {
        @Test
        @DisplayName("2-2i * 1-1i = 0-4i")
        void testSimpleTimes() {
            val complex = Complex.valueOf(2, -2);
            val target = Complex.valueOf(1, -1);

            val result = complex.times(target);

            val expected = Complex.valueOf(0, -4);

            assertEquals(expected, result);
        }
    }
}