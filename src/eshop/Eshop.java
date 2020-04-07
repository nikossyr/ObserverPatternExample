package eshop;

import java.util.ArrayList;
import java.util.List;

public class Eshop {
    private List<Observer> observers = new ArrayList<>();

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void attachObservers(List<Observer> observers) {
        this.observers.addAll(observers);
    }

    public void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.setMessage(message);
            observer.update();
        }
    }
}
