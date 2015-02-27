public class BuzzRule extends Rule {
    @Override
    public boolean evaluateExpression(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getValueFor(int number) {
        return "Buzz";
    }

    @Override
    public Rule getNextRule() {
        return new OwnNumberRule();
    }
}
