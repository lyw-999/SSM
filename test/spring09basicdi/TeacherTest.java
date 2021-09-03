package spring09basicdi;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TeacherTest {

    @Test
    public void test01(){
        // 1.加载容器的 xml
        String xml = "spring09basicdi/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        // 我们要拿 主体
       Teacher teacher = ac.getBean("teacher",Teacher.class);
        System.out.println("teacher = " + teacher);
    }
}
