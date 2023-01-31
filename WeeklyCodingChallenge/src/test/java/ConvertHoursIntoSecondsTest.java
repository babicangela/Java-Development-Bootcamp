import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ConvertHoursIntoSecondsTest {

    @Test
    public void testHoursToSeconds() {
        assertEquals(7200, ConvertHoursIntoSeconds.hoursToSeconds(2));
        assertEquals(36000, ConvertHoursIntoSeconds.hoursToSeconds(10));
        assertEquals(86400, ConvertHoursIntoSeconds.hoursToSeconds(24));
    }
}