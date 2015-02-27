public class FizzBuzzRule extends Rule {
    @Override
    public boolean evaluateExpression(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public String getValueFor(int number) {
        return "FizzBuzz";
    }

    @Override
    public Rule getNextRule() {
        return new FizzRule();
    }
}
