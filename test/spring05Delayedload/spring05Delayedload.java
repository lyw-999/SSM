package spring05Delayedload;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class spring05Delayedload {

    @Test
    public void test01() {
        // 1.加载容器的 xml
        String xml = "spring05Delayedload/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);// 是否出现 茶叶类的 构造
            // lazy-init="true" 属性加上 就是延迟加载
    }
}
