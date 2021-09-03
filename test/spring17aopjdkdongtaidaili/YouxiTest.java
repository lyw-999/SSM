package spring17aopjdkdongtaidaili;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


//jdk动态代理看 生气了代理对象 代理对象由程序员手写变为了 统一的jdk中的类 直接调用即可
public class YouxiTest {

    @Test
    public void test01(){
        Youxi wz = new Youxi();
      Conn jdkProxy = (Conn) Proxy.newProxyInstance(wz.getClass().getClassLoader(),
            wz.getClass().getInterfaces(),
            new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Integer integer =(Integer)method.invoke(wz,args);
                if (integer != null) {
                    integer =60;
                }
                return integer;
            }
        } );

      int i =jdkProxy.conNet();
        System.out.println("i = " + i);
    }
}
