package design_mode.decorator;

//抽象装饰角色
class Decorator implements Component {
    private Component a;
    private Component b;
    public Decorator(Component a,Component b) {
        this.a = a;
        this.b = b;
    }

    public void operation() {
        a.operation();
        b.operation();
    }
}