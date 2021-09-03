package SpringZuoyeTest5;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Browser2Test {

    @Test
    public void test01(){
        Browser1 tx = new Browser1();
          ConnGoogle connGoogle =   (ConnGoogle)   Proxy.newProxyInstance(tx.getClass().getClassLoader(),
                tx.getClass().getInterfaces(),
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Boolean b =(Boolean)method.invoke(tx,args);
                        if (b != null) {
                            b =true;
                        }
                        return b;
                    }
                } );
        boolean go = connGoogle.go();
        System.out.println("现在去谷歌 = " + go);
    }
}
