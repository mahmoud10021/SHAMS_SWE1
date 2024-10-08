package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GermanTranslatorTest {

    private GermanTranslator translator;

    // die Methode init BevorEach  Objekt erzeugung "Frau Weil prog 2"
    @BeforeEach
    public void init() {
        GermanTranslator translator = new GermanTranslator();

    }

    @Test
    public void aTest() {

        assertEquals("null" , translator.translateNumber(0));
    }

    @Test
    public void  zahlImInterval(){
        assertEquals("Fünf", translator.translateNumber(5));
    }

    @Test
    public void  negativeZahl(){
        assertEquals("\"Übersetzung der Zahl \" -5 \" nicht möglich (Version: \" 1.0 \")\"", translator.translateNumber(-5));
    }
    @Test
    public void  zahlAusserInterval(){
        assertEquals("\"Übersetzung der Zahl \" 11 \" nicht möglich (Version: \" 1.0 \")\"", translator.translateNumber(11));
    }

}