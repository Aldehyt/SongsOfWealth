package utils.patterns.observer;


import java.util.ArrayList;

public class Observer {

    private final ArrayList<ISubscriber> listOfSubscribers = new ArrayList<>();

    public void addSubscriber(ISubscriber subscriber) {
        listOfSubscribers.add(subscriber);
    }
    public void notifySubscribers() {
        for (ISubscriber sub : listOfSubscribers) {
            sub.notified();
        }
    }

}