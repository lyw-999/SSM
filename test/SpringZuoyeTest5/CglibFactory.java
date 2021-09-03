package SpringZuoyeTest5;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import spring18aopcglib.Man;

import java.lang.reflect.Method;


public class CglibFactory implements MethodInterceptor {

    private Browser2 browser2;

    public CglibFactory(){
        browser2 = new Browser2();
    }

    // 在医院中 收集DNA生产子类
    public Browser2 cglibCreator(){
        //1.用字节码的增强器
        Enhancer enhancer = new Enhancer();
        //2.指定一个 父亲
        enhancer.setSuperclass(Browser2.class);
        //3. 调用工厂 执行
        enhancer.setCallback(this);
        //4.创建
        return (Browser2)enhancer.create();
    }


    //  方法的拦截 实现他爹的梦想
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Boolean aBoolean = (Boolean) method.invoke(browser2, objects);
        aBoolean = true;
        return aBoolean;
    }
}
