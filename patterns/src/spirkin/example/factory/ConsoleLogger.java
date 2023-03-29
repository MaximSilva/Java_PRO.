package spirkin.example.factory;

public class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String msg) {
        System.out.println("Console logger: " + msg);
    }
}
