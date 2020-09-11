package design_mode.factory.simple_factory;

//具体产品A：实现抽象产品中的抽象方法
class ConcreteProductA implements Product {
    public void use() {
        System.out.println("具体产品A显示...");
    }
}