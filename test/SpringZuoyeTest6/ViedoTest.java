package SpringZuoyeTest6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ViedoTest {

    @Test
    public void test01() {
        String xml = "SpringZuoyeTest6/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        VideoService videoService = ac.getBean("videoService", VideoService.class);
        videoService.begin();
        System.out.println("----------------------------------------");
//        videoService.stop();
//        System.out.println("----------------------------------------");
//        videoService.turnCoin();
//        System.out.println("----------------------------------------");
//        videoService.lostVideo();

    }
}
