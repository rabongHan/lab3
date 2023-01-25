import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 2, 3}, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = {4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1, 2, 3, 4}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = {1.0};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input1 = {1.0, 1.0, 1.0, 2.0, 2.0};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAverageWithoutLowest4() {
    double[] input1 = {2.4, 2.4, 2.4, 2.1};
    assertEquals(2.4, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

}
