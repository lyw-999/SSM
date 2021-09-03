package SpringZuoyeTest4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadPropTest {
    @Test
    public void test01(){
        String xml = "SpringZuoyeTest4/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        ReadProp readProp = ac.getBean("readProp", ReadProp.class);
        System.out.println("readProp = " + readProp);
    }
}
