import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test 
	public void testFilter1() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
	}

    @Test
    public void testMerge1() {
        double[] input1 = {};
        assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.001);
    }
}
