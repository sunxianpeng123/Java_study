package design_mode.factory.simple_factory;

//具体产品B：实现抽象产品中的抽象方法
class ConcreteProductB implements Product {
    public void use() {
        System.out.println("具体产品B显示...");
    }
}