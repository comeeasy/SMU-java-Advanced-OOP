import java.time.LocalTime;
import java.util.ArrayList;

public class MyTimer extends Thread implements IObservable{
    private boolean stopRunning;
    private ArrayList<IObserver> obsList;

    public MyTimer() {
        stopRunning = false;
        obsList = new ArrayList<IObserver>();
    }

    @Override
    public void run() {
        while(!stopRunning) {
            LocalTime time = LocalTime.now();
            String msg = "" + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
            update(msg);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void stopRunning() {
        stopRunning = true;
    }


    @Override
    public void addObserver(IObserver obs) {
        this.obsList.add(obs);
    }

    @Override
    public void rmObserver(IObserver obs) {
        this.obsList.remove(obsList.indexOf(obs));
    }

    @Override
    public void update(String msg) {
        for(IObserver o : this.obsList) {
            o.updateText(msg);
        }
    }
}
