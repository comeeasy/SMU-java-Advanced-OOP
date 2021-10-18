public interface IObservable {
    void addObserver(IObserver obs);
    void rmObserver(IObserver obs);
    void update(String msg);
}
