package spirkin.example.absfactory;

public class JsonMessage implements Message {
    @Override
    public String toString() {
        return "{\"msg\":\"Hello\"}";
    }
}
