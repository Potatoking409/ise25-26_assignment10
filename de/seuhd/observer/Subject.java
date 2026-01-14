package de.seuhd.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected final List<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
