package design_mode.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        //抽象构件角色
        //具体构件角色
        Component componentA = new ConcreteComponentA();
        componentA.operation();
        Component componentB = new ConcreteComponentB();
        componentB.operation();
        System.out.println("---------------------------------");
        Component decorator = new ConcreteDecorator(componentA,componentB);
        decorator.operation();
    }
}





