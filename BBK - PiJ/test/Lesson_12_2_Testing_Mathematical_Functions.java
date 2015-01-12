import org.junit.*;
import static org.junit.Assert.*;

// series of tests for Lesson 8.5.1 Hash Functions
public class Lesson_12_2_Testing_Mathematical_Functions {
    
    @Test
    public void testsNegativeInteger(){
        int input = -1;
        int output = HashUtilities.shortHash(input);
        int expected = 1;
        assertEquals(output, expected);
    }
    
    @Test
    public void testIntegerGreaterThanHashUpper(){
        int input = 1001;
        int output = HashUtilities.shortHash(input);
        int expected = 1;
        assertEquals(output, expected);
    }
    
    @Test
    public void testLargeAmountOfNumbers(){
        for(int i = 0; i < 2000; i++){
            int input = (int)(Math.random()*100)*i;
            int output = HashUtilities.shortHash(input);
            int expected = input % 1000;
            assertEquals(output, expected);
        }
    }
    
    @Test
    public void testString(){
        String input = "Test";
        int output = HashUtilities.shortHash(input.hashCode());
        int expected = input.hashCode()%1000;
        assertEquals(output, expected);
    }
    
}