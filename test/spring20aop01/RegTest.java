package spring20aop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegTest {
    //测试目的: 把msg的切面 次要业务融合 在 主要业务reg里面去
    // 用spring去实现.
    //后置通知
    @Test
    public void test01(){
        String xml ="spring20aop01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        RegService regService = ac.getBean("regService", RegService.class);
        regService.addUser();
        System.out.println(" ===========" );
        regService.login();
        System.out.println(" ===========" );
        regService.transMoney();
    }
}
