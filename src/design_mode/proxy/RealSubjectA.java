package design_mode.proxy;

//真实主题
class RealSubjectA implements Subject {
    public void request() {
        System.out.println("访问真实主题方法A...");
    }
}