package design_mode.factory.simple_factory;

//具体工厂B：实现了厂品的生成方法
class ConcreteFactoryB implements Factory {
    public Product createProduct() {
        System.out.println("具体工厂B生成-->具体产品B.");
        return new ConcreteProductB();
    }
}