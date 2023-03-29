package spirkin.example.observer;

public abstract class ClientObserver {
    protected ChatSubject subject;
    public abstract void update();
}
