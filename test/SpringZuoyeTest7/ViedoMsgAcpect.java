package SpringZuoyeTest7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect
public class ViedoMsgAcpect {
    @Pointcut("execution (* SpringZuoyeTest7.*.*(..))")

    public void pt(){
        System.out.println("切入点表达式......");
    }
//    @Before("pt()")
//    public void beforeMsg(){
//        System.out.println("前置通知......观影之前要看广告");
//    }
//    @AfterReturning("pt()")
//    public void afterMsg(){
//        System.out.println("后置通知......亲办理会员可以观看VIP影视");
//    }
      @Around("pt()")
        public void aroundMsg(ProceedingJoinPoint joinPoint){
            System.out.println("需要验证一下");
            try {
                Object proceed = joinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            System.out.println(" 转金币成功 ");
        }
//    @AfterThrowing(value = "pt()",throwing = "e")
//    public void throwing(JoinPoint joinPoint,Exception e){
//        System.out.println("视频资源异常请观看其他同类视频");
//        System.out.println("异常通知 = " + e.getMessage());
//    }
    @After("pt()")
    public void afterFinal(){
        System.out.println("最终的通知.....看完了");
    }
}
