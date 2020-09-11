package design_mode.decorator;

//具体装饰角色
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component a,Component b) {
        super(a,b);
    }

    public void operation() {
        super.operation();
        addBehavior();
    }

    public void addBehavior() {
        System.out.println("为具体构件角色增加额外的功能addBehavior()");
    }
}