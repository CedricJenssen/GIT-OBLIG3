import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTests {


    //Var litt usikker på hvordan jeg skulle navngi testene.
    @Test
    public void year_400_is_a_leap_year() {
        assertTrue(LeapYear.isLeapYear(400));
    }

    @Test
    public void year_200_is_not_a_leap_year() {
        assertFalse(LeapYear.isLeapYear(200));
    }

    @Test
    public void year_2000_is_a_leap_year() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void year_1900_is_not_a_leap_year() {
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    public void year_300_can_be_divided_by_100_but_not_400() {
        assertFalse(LeapYear.isLeapYear(300));
    }

    @Test
    public void year_16_can_be_divided_by_4_and_not_100() {
        assertTrue(LeapYear.isLeapYear(16));
    }

}
