package design_mode.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.algorithm();
        System.out.println("-----------------");
        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.algorithm();
    }
}







