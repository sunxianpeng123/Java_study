package design_mode.proxy;

//真实主题
class RealSubjectB implements Subject {
    public void request() {
        System.out.println("访问真实主题方法B...");
    }
}