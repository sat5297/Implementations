public class ErrorLogger extends Logger {
    ErrorLogger(Logger nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        }
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}