import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClockEqualTest {


    @Test
    public void clocksWithSameTimeAreEqual() {
        assertThat(new Clock(15, 37))
                .isEqualTo(new Clock(15, 37));
    }


    @Test
    public void clocksAMinuteApartAreNotEqual() {
        assertThat(new Clock(15, 36))
                .isNotEqualTo(new Clock(15, 37));
    }


    @Test
    public void clocksAnHourApartAreNotEqual() {
        assertThat(new Clock(14, 37))
                .isNotEqualTo(new Clock(15, 37));
    }


    @Test
    public void clocksWithHourOverflow() {
        assertThat(new Clock(34, 37))
                .isEqualTo(new Clock(10, 37));
    }


    @Test
    public void clocksWithHourOverflowBySeveralDays() {
        assertThat(new Clock(99, 11))
                .isEqualTo(new Clock(3, 11));
    }


    @Test
    public void clocksWithNegateHour() {
        assertThat(new Clock(-2, 40))
                .isEqualTo(new Clock(22, 40));
    }


    @Test
    public void clocksWithNegativeHourThatWraps() {
        assertThat(new Clock(-31, 3))
                .isEqualTo(new Clock(17, 3));
    }


    @Test
    public void clocksWithNegativeHourThatWrapsMultipleTimes() {
        assertThat(new Clock(-83, 49))
                .isEqualTo(new Clock(13, 49));
    }


    @Test
    public void clocksWithMinuteOverflow() {
        assertThat(new Clock(0, 1441))
                .isEqualTo(new Clock(0, 1));
    }


    @Test
    public void clocksWithMinuteOverflowBySeveralDays() {
        assertThat(new Clock(2, 4322))
                .isEqualTo(new Clock(2, 2));
    }


    @Test
    public void clocksWithNegativeMinutes() {
        assertThat(new Clock(3, -20))
                .isEqualTo(new Clock(2, 40));
    }


    @Test
    public void clocksWithNegativeMinutesThatWraps() {
        assertThat(new Clock(5, -1490))
                .isEqualTo(new Clock(4, 10));
    }


    @Test
    public void clocksWithNegativeMinutesThatWrapsMultipleTimes() {
        assertThat(new Clock(6, -4305))
                .isEqualTo(new Clock(6, 15));
    }


    @Test
    public void clocksWithNegativeHoursAndMinutes() {
        assertThat(new Clock(-12, -268))
                .isEqualTo(new Clock(7, 32));
    }


    @Test
    public void clocksWithNegativeHoursAndMinutesThatWrap() {
        assertThat(new Clock(-54, -11513))
                .isEqualTo(new Clock(18, 7));
    }


    @Test
    public void clocksWithFullClockAndZeroedClockAreEqual() {
        assertThat(new Clock(24, 0))
                .isEqualTo(new Clock(0, 0));
    }

}
