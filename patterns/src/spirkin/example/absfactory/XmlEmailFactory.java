package spirkin.example.absfactory;

public class XmlEmailFactory extends AbstractFactory {
    @Override
    public Message createMessage() {
        return new XmlMessage();
    }

    @Override
    public Sender createSender() {
        return new EmailSender();
    }
}
