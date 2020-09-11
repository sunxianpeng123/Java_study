package design_mode.factory.simple_factory;

public class FactoryPattern
{
    public static void main(String[] args)
{
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.use();
    }
}