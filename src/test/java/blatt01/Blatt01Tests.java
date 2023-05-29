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
    public void prepareation(){
        System.setOut(new PrintStream(outContent));
    }
    @After
    public void cleaning(){
        outContent.reset();
    }

    @Test
    public void MyFirstProgramTest(){
        MyFirstProgram.main(null);
        assertEquals("Hello World!\r\n",outContent.toString());
    }

    @Test
    public void StringCodesTest(){
        StringCodes.main(null);
        String s = "Monat\t\t\tGewinn\r\nSeptember 2017\t221.000 €\r\nOktober 2017\t1.009.520 €\r\n";
        assertEquals(s,outContent.toString());
    }
}
