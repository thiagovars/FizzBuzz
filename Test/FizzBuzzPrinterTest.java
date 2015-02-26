import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class FizzBuzzPrinterTest {
    @Test
    public void retornaUmQuandoRecebeUm(){
        FizzBuzzPrinter printado = new FizzBuzzPrinter();
        String numeroImpresso = printado.shout(1);
        assertEquals("1", numeroImpresso);
    }
    @Test
    public void retornaDoisQuandoRecebeDois(){
        FizzBuzzPrinter dois = new FizzBuzzPrinter();
        String retornandoDois = dois.shout(2);
        assertEquals("2", retornandoDois);
    }
    @Test
    public void retornaFizzQuandoRecebeTres(){
        FizzBuzzPrinter fizz = new FizzBuzzPrinter();
        String retornandoFizz = fizz.shout(3);
        assertEquals("Fizz", retornandoFizz);
    }
    @Test
    public void retornaQuatroQuandoRecebeQuatro(){
        FizzBuzzPrinter quatro = new FizzBuzzPrinter();
        String retornandoQuatro = quatro.shout(4);
        assertEquals("4", retornandoQuatro);
    }
    @Test
    public void retornaBuzzQuandoRecebeCinco(){
        FizzBuzzPrinter buzz = new FizzBuzzPrinter();
        String retornandoBuzz = buzz.shout(5);
        assertEquals("Buzz", retornandoBuzz);
    }
    @Test
    public void returnaFizzBuzzQuandoRecebeQuinze(){
        FizzBuzzPrinter quinze = new FizzBuzzPrinter();
        String retornandoFizzBuzz = quinze.shout(15);
        assertEquals("FizzBuzz", retornandoFizzBuzz);
    }
}