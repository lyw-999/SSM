package SpringZuoyeTest7;

import SpringZuoyeTest6.VideoService;
import org.springframework.stereotype.Service;

@Service("videoService")
public class ViedoServiceImpl implements VideoService {
    @Override
    public void begin() {
        System.out.println("现在是观看视频");
    }

    @Override
    public void stop() {
        System.out.println("现在是暂停视频");
    }

    @Override
    public void turnCoin() {
        System.out.println("现在是转金币");
    }

    @Override
    public void lostVideo() {
        int i=1/0;
        System.out.println("视频资源丢失");
    }
}
