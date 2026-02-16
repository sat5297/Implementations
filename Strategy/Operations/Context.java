public class Context {
    Strategy strategy;

    public Context(Strategy strategy) { 
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int performOperation(int a, int b) {
        return strategy.doOperation(a, b);
    }
}