public class InfoLogger extends Logger {
    InfoLogger(Logger nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO: " + message);
        }
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}