package spring19aopxuqiu;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;
import org.junit.Test;

import java.lang.reflect.Method;


public class AopTest {


    @Test
    public void test01(){

//        PaiDui paidui = new PaiDui();
//        paidui.paiHao();


        Bank bank = new Bank();
        bank.cunKuan();
    }


    @Test //使用动态代理解决 切面类+主要业务 组合在一起
    public void test02(){
        // 排队 存钱
        //1. 目标对象
        BankService target = new BankServiceImpl();
        //2. 代理对象
         BankService bankService = (BankService)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                 target.getClass().getInterfaces(),
                 new InvocationHandler() {
                     @Override
                     public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                         // 在这里 可以增强 目标对象i 其实就是直接把 切面类直接拿过来就可以了.
                         PaiDui.paiHao();  //学名 :织入
                         System.out.println("被织入了");
                         Object rs = method.invoke(target, objects);

                         return rs;
                     }
                 });
            bankService.cunKuan();
    }
}
