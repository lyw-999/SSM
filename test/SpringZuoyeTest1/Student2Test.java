package SpringZuoyeTest1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student2Test {

    @Test
    public void test01() {
        String xml = "SpringZuoyeTest1/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        Student2 student2 = ac.getBean("student2", Student2.class);
        System.out.println("student2 = " + student2);


    }
}
