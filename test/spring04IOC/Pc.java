package spring04IOC;

public class Pc {

    //出生后的 构造方法
    public  Pc(){
        System.out.println(" 电脑的无参构造就是 对象已诞生就会执行的方法 比如:人一出生就会Ku");
        System.out.println("构造方法就是 对象一诞生就会执行的方法 ,一般多用来 初始化自己的属性 比如颜色");
    }

    // 初始化方法
    public void initShow(){
        System.out.println("开机...");
        System.out.println("初始化方法就是 对象一诞生就会执行的方法 ,和构造方法不同的是 他多用来直接调用自己的方法");
    }

    //对象的普通方法 周期中  成年中
    public void platGame(){
        System.out.println("电脑的普通方法 用来打游戏");
    }

    //对象的死亡方法 参考过滤器, servlet
    public void desctory(){
        System.out.println("电脑中毒了...被砸了...地球没了...脑子进水了  总之电脑对象死亡");
    }
}
