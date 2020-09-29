package design_mode.observer;

import java.util.*;

public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer obsA = new ConcreteObserverA();
        Observer obsb = new ConcreteObserverB();
        subject.addObserver(obsA);
        subject.addObserver(obsb);
        subject.doSomething();
    }
}







