public class Logger {
    Logger nextLogProcessor;
    static final int INFO = 1;
    static final int DEBUG = 2;
    static final int ERROR = 3;

    Logger(Logger nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}