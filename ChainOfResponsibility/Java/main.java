
public class main {
    public static void main(String[] args) {
        Logger loggerChain = new ErrorLogger(new DebugLogger(new InfoLogger(null)));

        loggerChain.log(Logger.INFO, "This is an info message log.");
        loggerChain.log(Logger.DEBUG, "This is a debug message log.");
        loggerChain.log(Logger.ERROR, "This is an error message log.");
    }
}