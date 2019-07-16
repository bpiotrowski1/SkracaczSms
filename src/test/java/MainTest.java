import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testPodstawowyPrzypadek() {
        String wejscie = "Ala ma kotka";
        String spodziewanyRezultat = "AlaMaKotka";

        String otrzymanyRezultat = Main.skrocSms(wejscie);

        assertEquals(spodziewanyRezultat, otrzymanyRezultat);
    }

    @Test
    public void testPodwojnaSpacja() {
        assertEquals("AlaMaKotka",
                Main.skrocSms("Ala ma  kotka"));
    }

    @Test
    public void testInterpunkcja() {
        assertEquals("AlaMaKotka,Pieska,Żabkę!",
                Main.skrocSms("Ala ma kotka, pieska, żabkę!"));
        assertEquals("AlaMaKotko-piesko-żabkę!",
                Main.skrocSms("Ala ma kotko-piesko-żabkę!"));
    }

    @Test
    public void testDuzeLitery() {
        assertEquals("AlaMaKotka",
                Main.skrocSms("ALA MA KOTKA"));
    }

    @Test
    public void testNull() {
        assertNull(Main.skrocSms(null));
    }

    @Test
    public void testPustyString() {
        assertEquals("",
                Main.skrocSms(""));
    }
}