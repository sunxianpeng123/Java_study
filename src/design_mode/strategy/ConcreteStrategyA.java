package design_mode.strategy;

//具体策略类A
class ConcreteStrategyA implements Strategy {
    public void algorithm() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}