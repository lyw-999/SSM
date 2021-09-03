package spring08autowire;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class spring08autoTest {

    @Test
    public void test01(){
        // 1.加载容器的 xml
        String xml = "spring08autowire/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        // 我们要拿 主体
       Student student = ac.getBean("student",Student.class);
        student.play();
    }
}
