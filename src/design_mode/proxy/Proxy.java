package design_mode.proxy;

//代理
class Proxy implements Subject {
    private RealSubjectA realSubjectA;
    private RealSubjectB realSubjectB;
    public void request() {
        if (realSubjectA == null) {
            realSubjectA = new RealSubjectA();
        }
        if (realSubjectB == null) {
            realSubjectB = new RealSubjectB();
        }
        preRequest();
        realSubjectA.request();
        realSubjectB.request();
        afterRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void afterRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}