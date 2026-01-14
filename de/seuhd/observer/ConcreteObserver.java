package de.seuhd.observer;

public class ConcreteObserver implements Observer {

    private static int counter = 0;

    private final int id;
    private final Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.id = ++counter;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject concreteSubject) {
            System.out.println(
                    "Observer " + id + " received update from subject: New value is " + concreteSubject.getValue()
            );
        }
    }

    public void detach() {
        subject.detach(this);
    }
}
