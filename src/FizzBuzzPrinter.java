public class FizzBuzzPrinter {

    public String shout(int number){
        Rule firstRule = new FizzBuzzRule();
        return firstRule.evaluateAndReturn(number);
    }
}
