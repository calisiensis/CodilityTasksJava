import org.junit.Assert;
import org.junit.Test;
import pl.org.schroeder.BinaryGap;

public class BinaryGapTests {

@Test
    public void binaryGapTestOne(){

    //Given
    int N = 43121;

    //When
    int effect = BinaryGap.solution(N);
    int desiredResult = 4;

    //Then
    Assert.assertEquals(desiredResult, effect);
}

    @Test
    public void binaryGapTestTwo(){

        //Given
        int N = 1610612737;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 28;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestThree(){

        //Given
        int N = 1073741825;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 29;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestFour(){

        //Given
        int N = 6;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 0;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestFive(){

        //Given
        int N = 6;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 0;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestSix(){

        //Given
        int N = 19;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 2;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestSeven(){

        //Given
        int N = 42;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 1;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestEight(){

        //Given
        int N = 561892;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 3;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestNine(){

        //Given
        int N = 328;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 2;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void binaryGapTestTen(){

        //Given
        int N = 66561;

        //When
        int effect = BinaryGap.solution(N);
        int desiredResult = 9;

        //Then
        Assert.assertEquals(desiredResult, effect);
    }

}
