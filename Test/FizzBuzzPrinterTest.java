import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzPrinterTest {

    @Test
    public void retornaUmQuandoRecebeUm(){
        FizzBuzzPrinter printado = new FizzBuzzPrinter();
        String numeroImpresso = printado.shout(1);
        assertEquals("1", numeroImpresso);
    }
}