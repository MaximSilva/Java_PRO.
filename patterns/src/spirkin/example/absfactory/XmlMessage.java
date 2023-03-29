package spirkin.example.absfactory;

public class XmlMessage implements Message {
    @Override
    public String toString() {
        return "<message>Hello</message>";
    }
}
