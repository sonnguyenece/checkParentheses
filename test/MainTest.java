import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void maintest1() {
        String testString="s * (s – a) * (s – b) * (s – c)   ";
        String[] input = testString.toLowerCase().split("");
        boolean actual= Main.checkBracket(input);
        boolean expected=true;
        assertEquals(expected,actual);
    }
    @Test
    public void maintest2() {
        String testString="(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        String[] input = testString.toLowerCase().split("");
        boolean actual= Main.checkBracket(input);
        boolean expected=true;
        assertEquals(expected,actual);
    }
    @Test
    public void maintest3() {
        String testString="s * (s – a) * (s – b * (s – c)     ";
        String[] input = testString.toLowerCase().split("");
        boolean actual= Main.checkBracket(input);
        boolean expected=false;
        assertEquals(expected,actual);
    }
    @Test
    public void maintest4() {
        String testString="s * (s – a) * s – b) * (s – c)    ";
        String[] input = testString.toLowerCase().split("");
        boolean actual= Main.checkBracket(input);
        boolean expected=false;
        assertEquals(expected,actual);
    }
    @Test
    public void maintest5() {
        String testString="(– b + (b^2 – 4*a*c)^(0.5/ 2*a))   ";
        String[] input = testString.toLowerCase().split("");
        boolean actual= Main.checkBracket(input);
        boolean expected=true;
        assertEquals(expected,actual);
    }

}