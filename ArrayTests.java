import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 7,7,6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6,7,7 }, input1);
  }



  @Test
  public void testReversed() {
    int[] input1 = { 2,2,1};
    assertArrayEquals(new int[]{1, 2,2}, ArrayExamples.reversed(input1));
  }


  
  @Test
  public void testArrayAvg(){
    double[] test = {7.0, 7.0, 9.0, 13.0};
    assertEquals(7.33333333333333333, ArrayExamples.averageWithoutLowest(test),0);
  }

}
