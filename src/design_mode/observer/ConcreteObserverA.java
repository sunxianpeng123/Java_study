package design_mode.observer;

//具体观察者A
class ConcreteObserverA implements Observer {
    public void process() {
        System.out.println("具体观察者A处理！");
    }
}