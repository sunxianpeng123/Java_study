package design_mode.strategy;

//具体策略类B
class ConcreteStrategyB implements Strategy {
    public void algorithm() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}