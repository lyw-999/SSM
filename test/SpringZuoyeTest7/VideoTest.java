package SpringZuoyeTest7;


import SpringZuoyeTest6.VideoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用juint
@ContextConfiguration(locations = "classpath:SpringZuoyeTest7/applicationContext.xml")
public class VideoTest {
    @Autowired
    private VideoService videoService;

    @Test
    public void test01(){
       // videoService.begin();
      //  videoService.stop();
        videoService.turnCoin();
       // videoService.lostVideo();
    }

}
