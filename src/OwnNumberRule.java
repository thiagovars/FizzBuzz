public class OwnNumberRule extends Rule {
    @Override
    public boolean evaluateExpression(int number) {
        return true;
    }

    @Override
    public String getValueFor(int number) {
        return String.valueOf(number);
    }

    @Override
    public Rule getNextRule() {
        return null;
    }
}
