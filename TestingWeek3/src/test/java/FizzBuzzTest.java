import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        FizzBuzz2 fb = new FizzBuzz2();
        assertEquals("1", fb.fizzBuzz(1));
        assertEquals("2", fb.fizzBuzz(2));
        assertEquals("Fizz", fb.fizzBuzz(3));
        assertEquals("4", fb.fizzBuzz(4));
        assertEquals("Buzz", fb.fizzBuzz(5));
        assertEquals("Fizz", fb.fizzBuzz(6));
        assertEquals("7", fb.fizzBuzz(7));
        assertEquals("8", fb.fizzBuzz(8));
        assertEquals("Fizz", fb.fizzBuzz(9));
        assertEquals("Buzz", fb.fizzBuzz(10));
        assertEquals("11", fb.fizzBuzz(11));
        assertEquals("Fizz", fb.fizzBuzz(12));
        assertEquals("13", fb.fizzBuzz(13));
        assertEquals("14", fb.fizzBuzz(14));
        assertEquals("FizzBuzz", fb.fizzBuzz(15));
    }
}
