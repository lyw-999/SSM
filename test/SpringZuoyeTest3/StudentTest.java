package SpringZuoyeTest3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {


    @Test
    public void test01(){
        String xml ="SpringZuoyeTest3/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);;
        StudentController studentController = ac.getBean("studentController", StudentController.class);
        System.out.println("studentController = " + studentController);
        studentController.insert();
        studentController.delete();
        studentController.update();
        studentController.selectAll();
    }
}
