public class FizzRule extends Rule {
    @Override
    public boolean evaluateExpression(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getValueFor(int number) {
        return "Fizz";
    }

    @Override
    public Rule getNextRule() {
        return new BuzzRule();
    }
}
