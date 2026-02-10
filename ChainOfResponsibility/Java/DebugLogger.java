public class DebugLogger extends Logger {
    DebugLogger(Logger nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        }
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}