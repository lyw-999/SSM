package spring19aopxuqiu;

/**
 * 这个类就是 切面类  切面类 和普通类有什么去呗
 * 1.逻辑上的区别？  切面类是次要业务，而普通类可能是 主要业务
 * 2.写法上的区别 一般切面类 里面很少有属性只有方法
 *
 * */
public class PaiDui {

    public static void paiHao(){
        System.out.println("排号类");
    }
}
