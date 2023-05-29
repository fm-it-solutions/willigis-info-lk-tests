import blatt07.Rechner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RechnerTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void test1(){
        assertEquals(3, Rechner.add(1,3));
        assertEquals(-2, Rechner.add(1,-3));
        assertEquals(10, Rechner.add(5,5));
    }

    @Test
    public void test2(){
        Rechner.printAdd(2,3);
        assertEquals("5" +System.lineSeparator(), outContent.toString());
        outContent.reset();
        Rechner.printAdd(-2,3);
        assertEquals("1" +System.lineSeparator(), outContent.toString());



    }

}
