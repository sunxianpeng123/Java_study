package design_mode.factory.simple_factory;

//具体工厂A：实现了厂品的生成方法
class ConcreteFactoryA implements Factory {
    public Product createProduct() {
        System.out.println("具体工厂A生成-->具体产品A.");
        return new ConcreteProductA();
    }
}