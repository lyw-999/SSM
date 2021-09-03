package SpringZuoyeTest6;

public class VideoServiceImpl implements VideoService{
    @Override
    public void begin(){
        System.out.println("现在是开始播放视频");
        // 播放前 插播广告
    }
    @Override
    public void stop(){
        System.out.println("现在是暂停视频");
        // 暂停一下 需要开通 VIP
    }

    @Override
    public void turnCoin() {
        System.out.println("现在是转金币 ");
        //  赚金币
    }

    @Override
    public void lostVideo(){
        int i=1/0;
        System.out.println("视频资源丢失");

        //  视频丢失  异常
    }
}
