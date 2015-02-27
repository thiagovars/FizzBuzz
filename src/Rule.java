
public abstract class Rule {
    public String evaluateAndReturn(int number) {
        if (this.evaluateExpression(number)) {
            return this.getValueFor(number);
        }
        return this.getNextRule().evaluateAndReturn(number);
    }

    public abstract boolean evaluateExpression(int number);

    public abstract String getValueFor(int number);

    public abstract Rule getNextRule();
}
