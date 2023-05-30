import blatt01.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.*;

public class Blatt01Tests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream defaultOut = System.out;

    @Before
    public void preparation(){
        System.setOut(new PrintStream(outContent));
    }
    @After
    public void cleaning(){
        outContent.reset();
        System.setOut(defaultOut);
    }

    @Test
    public void MyFirstProgramTest(){
        MyFirstProgram.main(null);
        assertEquals("Test passes if output equals 'Hello World!': ","Hello World!" + System.lineSeparator(),outContent.toString());
    }

    @Test
    public void StringCodesTest(){
        StringCodes.main(null);
        String s = "Monat\t\t\tGewinn"+ System.lineSeparator() +"September 2017\t221.000 €" + System.lineSeparator() + "Oktober 2017\t1.009.520 €" +System.lineSeparator();
        assertEquals("Test checks if String is exact like the exercise example (tip: use \\t): ",s,outContent.toString());
    }

    @Test
    public void ZuweisungenTest(){
        Zuweisungen.main(null);
        assertEquals("Test passes if output equals 2: ","2" + System.lineSeparator(),outContent.toString());
    }

    @Test
    public void ZahlenMengenTest(){
        ZahlenMengen.main(null);
        String s = "2" + System.lineSeparator() + "2.5" + System.lineSeparator();
        assertEquals(s,outContent.toString());
    }

    @Test
    public void ZinssatzTest(){
        Zinssatz.main(null);
        String output = outContent.toString();
        int posStart = output.indexOf(": ");
        double kapitalAlt = Double.parseDouble(output.substring(posStart+2,output.indexOf(" ",posStart+2)));
        posStart = output.indexOf(": ",posStart+1);
        double zinssatz = Double.parseDouble(output.substring(posStart+2,output.indexOf(" ",posStart+2)));
        posStart = output.indexOf(": ",posStart+1);
        double zinsen = Double.parseDouble(output.substring(posStart+2,output.indexOf(" ",posStart+2)));
        posStart = output.indexOf(": ",posStart+1);
        double kapitalNeu = Double.parseDouble(output.substring(posStart+2,output.indexOf(" ",posStart+2)));
        assertEquals("Test checks 'Zinsen': ",kapitalAlt*zinssatz/100,zinsen);
        assertEquals("Test checks 'Neues Kapital': ",kapitalAlt*(100 + zinssatz)/100 , kapitalNeu);
    }

    @Test
    public void HaendlerTest(){
        Haendler.main(null);
        String output = outContent.toString();
        int posStart = output.indexOf(System.lineSeparator());
        double normal = Double.parseDouble(output.substring(posStart+1,output.indexOf(" ",posStart+1)));
        posStart = output.indexOf(System.lineSeparator(),posStart+1);
        double mini = Double.parseDouble(output.substring(posStart+1,output.indexOf(" ",posStart+1)));
        posStart = output.indexOf(System.lineSeparator(),posStart+1);
        double micro = Double.parseDouble(output.substring(posStart+1,output.indexOf(" ",posStart+1)));
        posStart = output.indexOf(System.lineSeparator(),posStart+1);
        double gesamt = Double.parseDouble(output.substring(output.indexOf(" ",posStart+1),output.length()-3));
        assertEquals("Test checks total price of SD-cards: ",normal*5+mini*8+micro*12,gesamt);
    }

    @Test
    public void TypKonversionTest(){
        TypKonversion.main(null);
        assertTrue("Test always passes. It's an exercise for better understanding!", true);
    }
}
