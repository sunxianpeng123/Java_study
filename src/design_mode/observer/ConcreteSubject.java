package design_mode.observer;

//具体目标
class ConcreteSubject extends Subject {
//    private Integer state;
//
//    public void setState(Integer state) {
//        this.state = state;
//        // 状态改变通知观察者
//        notify();
//    }
//具体业务
    public void doSomething() {
        System.out.println("具体目标状态发生改变...");
        System.out.println("--------------");
        super.notifyObserver();
//        for (Observer obs : observers) {
//            obs.process();
//        }

    }
}