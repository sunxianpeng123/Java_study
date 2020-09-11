package design_mode.observer;

//具体观察者B
class ConcreteObserverB implements Observer {
    public void process() {
        System.out.println("具体观察者B处理！");
    }
}