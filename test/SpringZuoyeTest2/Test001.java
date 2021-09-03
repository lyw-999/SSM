package SpringZuoyeTest2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test001 {

    @Test
    public void test01() {
        String xml = "SpringZuoyeTest2/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        KeyWord keyWord = ac.getBean("keyWord", KeyWord.class);
        keyWord.knock();
    }
}
