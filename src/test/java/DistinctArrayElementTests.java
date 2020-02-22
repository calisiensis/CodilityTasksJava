import org.junit.Assert;
import org.junit.Test;
import pl.org.schroeder.DistinctArrayElement;

public class DistinctArrayElementTests {

    @Test
    public void DistinctArrayElementsTestOne() {

        // Given
        int[] A = {2,2,2,0,9,4,2,2,2,2};

        // When
        int effect = DistinctArrayElement.solution(A);
        int desiredResult = 4;

        // Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void DistinctArrayElementsTestTwo() {

        // Given
        int[] A = {2,2,2,2,2,2,2,2,2,2};

        // When
        int effect = DistinctArrayElement.solution(A);
        int desiredResult = 1;

        // Then
        Assert.assertEquals(desiredResult, effect);
    }

    @Test
    public void DistinctArrayElementsTestThree() {

        // Given
        int[] A = {};

        // When
        int effect = DistinctArrayElement.solution(A);
        int desiredResult = 0;

        // Then
        Assert.assertEquals(desiredResult, effect);
    }
}
