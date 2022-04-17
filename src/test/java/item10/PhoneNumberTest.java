package item10;

import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
    @Nested
    @DisplayName("等価テスト")
    class EqualsTest {
        @Test
        void TestEqualsSameAreaCodeAndPrefixAndLineNum() {
            val phoneNumber1 = new PhoneNumber(111, 111, 111);
            val phoneNumber2 = new PhoneNumber(111, 111, 111);

            assertEquals(phoneNumber1, phoneNumber2);
        }
        @Test
        void TestNotEqualsDifferentAreaCode() {
            val phoneNumber1 = new PhoneNumber(111, 111, 111);
            val phoneNumber2 = new PhoneNumber(112, 111, 111);

            assertNotEquals(phoneNumber1, phoneNumber2);
        }
        @Test
        void TestNotEqualsDifferentPrefix() {
            val phoneNumber1 = new PhoneNumber(111, 111, 111);
            val phoneNumber2 = new PhoneNumber(111, 112, 111);

            assertNotEquals(phoneNumber1, phoneNumber2);
        }
        @Test
        void TestNotEqualsDifferentLineNum() {
            val phoneNumber1 = new PhoneNumber(111, 111, 111);
            val phoneNumber2 = new PhoneNumber(111, 111, 112);

            assertNotEquals(phoneNumber1, phoneNumber2);
        }
    }

    @Nested
    @DisplayName("compareTo")
    class CompareToTest {

    }
}