package spring02ouhe;

//工厂类 工厂模式spring 创建bean的底层 工厂模式
// 单例模式 已经经过 6种 常用2种
// HR问: spring框架中 使用到了那种设计模式！
public class FactoryBean {
    public  static Usb getInstance(String beanName){
         Usb usb = null;

//        if (beanName.equals("MyTv")) {
//            usb = new MyTv();
//        }else if (beanName.equals("Mp4")) {
//            usb = new Mp4();
//        }else if (beanName.equals("Computer")) {
//            usb = new Computer();
//        }else if (beanName.equals("Mp3")) {
//            usb = new Mp4();
//        }else if (beanName.equals("Mp5")) {
//            usb = new Mp4();
//        }
        try {
            Class<Usb> usb1 = (Class<Usb>) Class.forName(beanName);
            usb = usb1.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usb;
       //记下来:   Spring就是个容器,  用来管理对象的.   如何才叫做 管理对象, 就是 负责 对象的
      //  1. 出生,  2. 使用 ,     3. 死亡,   这叫做生命周期 , 学名:  IOC     , 4 依赖关系   学名 DI   依赖注入

        // 结论 大量new 对象是造成 耦合的关键,那么就需要 一个框架来解决 new对象的 耦合
        //什么框架可以解决这个呢？ spring框架
        // 为什么spring可以解决new对象的耦合呢？ ---->底层的反射！！！
    }
}
