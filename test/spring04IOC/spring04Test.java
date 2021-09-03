package spring04IOC;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * 容器的由来 :根据甘冈的 工厂模式得出 一个项目中有着大量的对象
 * 那么大量的对象需要管理 如果管理更方便 使用容器 把对象统一处理
 *
 * Spring 中的 容器 ＩＯＣ
 * IOC　有个思想：　控制反转　什么叫做控制　　你的　出生　使用　死亡　都归我管
 * 　什么叫做　反转：事情本来由A控制　现在变为B控制
 * 　反转　即：　控制的主题　改变了！！
 * 　容器是负责控制反转的
 */


public class spring04Test {
    // 传统创建对象的三种方式  传统的对象没有统一的容器管理
    @Test
    public void test01(){
        // 第一种 :new   关键字
        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println("================");
        // 第二种 ： static 静态 静态工厂创建
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println("================");
        // 第三种: 实例工厂 创建
        Date time = calendar.getTime();
        System.out.println("time = " + time);
        System.out.println("以上就是 三种创建传统对象的方式");



        //传统的创建对象的 缺点:
        //1.控制权 在哪里   现在在 test01方法中
        // 2.对象创建的 执行顺序 有谁控制？

        // 下面使用 Spring 如何管理对象 （创建销毁）
    }

    // spring 容器
    @Test
    public void test02(){
        // 1.加载容器的 xml
        String xml = "spring04IOC/applicationContext.xml";
        // 2.xml 文件已经加载所有对象都已经 诞生了,这就喝 传统的test01 创建对象不一样了
        // 达到了 对象的统一 管理
        // 以前是new出来的对象 现在是spring通过反射 拿到了对象，这是控制权的改变  这就是控制反转
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);
        // 如何获取对象
        Date date =ac.getBean("date",Date.class);
        System.out.println("date = " + date);


        // 作用域 测试spring默认创建对象是否是单例模式
        Pc pc1 = ac.getBean("pc",Pc.class);
        Pc pc2 = ac.getBean("pc",Pc.class);
        System.out.println("pc1 = " + pc1);
        System.out.println("pc2 = " + pc2);
        System.out.println(pc1==pc2); // 默认是 单例模式 ,为true 即：内存地址一样
        //加上 scope="property" == 为 false
        ac.close();//关闭容器

        // 如果生命周期中使用 原型模式看,那么无法调用对象 的摧毁方法  所以少用原形模式
    }



}
