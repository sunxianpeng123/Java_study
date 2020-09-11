package design_mode.decorator;

//具体构件角色
class ConcreteComponentA implements Component {
    public ConcreteComponentA() {
        System.out.println("创建具体构件角色A");
    }

    public void operation() {
        System.out.println("调用具体构件角色A的方法operation()");
    }
}