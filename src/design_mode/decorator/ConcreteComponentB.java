package design_mode.decorator;

//具体构件角色
class ConcreteComponentB implements Component {
    public ConcreteComponentB() {
        System.out.println("创建具体构件角色B");
    }

    public void operation() {
        System.out.println("调用具体构件角色B的方法operation()");
    }
}