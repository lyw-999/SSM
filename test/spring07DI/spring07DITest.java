package spring07DI;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring06DI.Person;

public class spring07DITest {
    // 06DI 讲的是set注入 现在我们讲构造器注入
    @Test
    public void test01(){
        // 1.加载容器的 xml
        String xml = "spring07DI/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        // 我们要拿 主体
       People people = ac.getBean("people",People.class);
        people.play();
    }
}
