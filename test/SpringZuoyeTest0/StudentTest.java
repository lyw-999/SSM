package SpringZuoyeTest0;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    @Test
    public void test01() {
        String xml = "SpringZuoyeTest0/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Student student = ac.getBean("student", Student.class);
        System.out.println("student = " + student);
    }
}
