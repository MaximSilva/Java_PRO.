package spirkin.example.facade;

public class Main {
    public static void main(String[] args) {
        LoggerFacade logger = new LoggerFacade();
        logger.logConsole("Test");
        logger.logFile("Test");
    }
}
