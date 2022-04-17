package item34;

import lombok.val;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
    @Nested
    class PlusTest {
        @Test
        void 足し算の結果が正しいこと() {
            val result = Operation.PLUS.apply(1.0, 2.0);

            assertEquals(3.0, result);
        }
    }

    @Nested
    class MinusTest {
        @Test
        void 引き算の結果が正しいこと() {
            val result = Operation.MINUS.apply(2.0, 1.0);

            assertEquals(1.0, result);
        }
    }

    @Nested
    class TimesTest {
        @Test
        void 掛け算の結果が正しいこと() {
            val result = Operation.TIMES.apply(2.0, 2.0);

            assertEquals(4.0, result);
        }
    }

    @Nested
    class DivideTest {
        @Test
        void 割り算の結果が正しいこと() {
            val result = Operation.DIVIDE.apply(4.0, 2.0);

            assertEquals(2.0, result);
        }
    }

    @Nested
    class fromString {
        @Test
        void 足し算のインスタンスを取得できること() {
            val plus = Operation.fromString("+");

            assertTrue(plus.isPresent());
            assertEquals("+", plus.get().toString());
        }

        @Test
        void 引き算のインスタンスを取得できること() {
            val minus = Operation.fromString("-");

            assertTrue(minus.isPresent());
            assertEquals("-", minus.get().toString());
        }

        @Test
        void 掛け算のインスタンスを取得できること() {
            val times = Operation.fromString("*");

            assertTrue(times.isPresent());
            assertEquals("*", times.get().toString());
        }

        @Test
        void 割り算のインスタンスを取得できること() {
            val divide = Operation.fromString("/");

            assertTrue(divide.isPresent());
            assertEquals("/", divide.get().toString());
        }

        @Test
        void 登録されていない算術演算子の場合はnullをもつOptionalを返すこと() {
            val unSupported = Operation.fromString("e");

            assertTrue(unSupported.isEmpty());
        }
    }
}