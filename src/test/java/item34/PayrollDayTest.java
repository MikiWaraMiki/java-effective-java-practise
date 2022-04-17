package item34;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class PayrollDayTest {
    @ParameterizedTest
    @EnumSource(value = PayrollDay.class, names = {
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY"
    })
    void 月曜日から金曜日までは労働時間が480分以下の場合の支払い計算が正しいこと(PayrollDay day) {
        val minituesWorked = 480;
        val payRate = 2;

        val result = day.pay(minituesWorked, payRate);

        assertEquals(480 * 2, result);
    }

    @ParameterizedTest
    @EnumSource(value = PayrollDay.class, names = {
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY"
    })
    void 月曜日から金曜日で労働時間が480分を超過した分には残業手当がつくこと(PayrollDay payrollDay) {
        val minituesWorked = 490;
        val payRate = 2;

        val result = payrollDay.pay(minituesWorked, payRate);

        val expectedBase = minituesWorked * payRate;
        val expectedOverTimePay = (minituesWorked - 480) * payRate / 2;

        assertEquals(expectedBase + expectedOverTimePay, result);
    }

    @ParameterizedTest
    @EnumSource(value = PayrollDay.class, names =  {
            "SATURDAY",
            "SUNDAY"
    })
    void 土日の場合は労働時間分だけ残業手当がつくこと(PayrollDay day) {
        val minituesWorked = 480;
        val payRate = 2;

        val result = day.pay(minituesWorked, payRate);

        val expectedBase = minituesWorked * payRate;
        val expectedOverTimePay = expectedBase / 2;
        assertEquals(expectedBase + expectedOverTimePay, result);
    }
}