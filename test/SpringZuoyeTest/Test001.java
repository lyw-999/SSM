package SpringZuoyeTest;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test001 {

     @Test
    public void test01() {
        // 1.加载容器的 xml
        String xml = "SpringZuoyeTest/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        // 我们要拿 主体
        Person person = ac.getBean("person", Person.class);
        person.eat();

    }
}
