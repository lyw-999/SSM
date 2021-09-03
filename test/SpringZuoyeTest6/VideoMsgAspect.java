package SpringZuoyeTest6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class VideoMsgAspect {


    public void beginMsg(){
        System.out.println("观影之前要观看广告");
    }

    public void stopMsg(){
        System.out.println("亲.办理会员可以观看VIP影视");
    }

    public void sendMsg(){
        System.out.println("需要验证一下");
    }

    public void lostMsg(){
        System.out.println("视频资源丢失,推荐您观看其他同类视频");
    }
    //环绕通知的切面
    public void roundMsg(ProceedingJoinPoint pj){
        //我是上面的方法
        sendMsg();
        //目标方法
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //我是下面 的方法
        System.out.println(" 转金币成功 ");
    }


    //异常
    public void sendMsgError(JoinPoint joinPoint, Exception e){
            lostMsg();
        System.out.println("向管理员的邮箱发送异常信息...");
    }

     //最终的通知
//    public void finalMsg(){
//        System.out.println("最终的通知");
//    }
}
