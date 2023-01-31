import org.testng.Assert;
import org.testng.annotations.Test;

public class HowManyVowelsTest {
    @Test
    public void testCountVowels() {
        Assert.assertEquals(HowManyVowels.countVowels("Celebration"), 5);
        Assert.assertEquals(HowManyVowels.countVowels("Palm"), 1);
        Assert.assertEquals(HowManyVowels.countVowels("Prediction"), 4);
    }

}
