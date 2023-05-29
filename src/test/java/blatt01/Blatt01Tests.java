package blatt01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class Blatt01Tests {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void preparation(){
        System.setOut(new PrintStream(outContent));
    }
    @After
    public void cleaning(){
        outContent.reset();
    }

    @Test
    public void MyFirstProgramTest(){
        MyFirstProgram.main(null);
        assertEquals("Hello World!" + System.lineSeparator(),outContent.toString());
    }

    @Test
    public void StringCodesTest(){
        StringCodes.main(null);
        String s = "Monat\t\t\tGewinn"+ System.lineSeparator() +"September 2017\t221.000 €" + System.lineSeparator() + "Oktober 2017\t1.009.520 €" +System.lineSeparator();
        assertEquals(s,outContent.toString());
    }
}
