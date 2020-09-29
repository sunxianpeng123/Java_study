package design_mode.factory.simple_factory;

public class FactoryMain {
    public static void main(String[] args) {
        //通过子类创建父类的对象
        Factory factory = new ConcreteFactoryA();
        System.out.println("factory.createProduct():::::::::::" + factory.createProduct());
        Product product = factory.createProduct();
        product.use();
    }
}