package spring11readprop;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadPropTest {

    //第一种读取 properties
    @Test
    public void test01(){

        String xml = "spring11readprop/applicationContext.xml";

         ApplicationContext ac = new ClassPathXmlApplicationContext(xml);;

        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
       // System.out.println("dataSource.getConnection() = " + dataSource.getConnection());

    }

    @Test
    public void test02(){

        String xml = "spring11readprop/applicationContext.xml";

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);;

        ComboPooledDataSource dataSource1 = ac.getBean("dataSource1", ComboPooledDataSource.class);
        System.out.println("dataSource1 = " + dataSource1);
       // System.out.println("dataSource1 = " + dataSource1.getConnection());

    }

    @Test
    public void test03(){

        String xml = "spring11readprop/applicationContext.xml";

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);;

        ReadPropertiesBean readPropertiesBean = ac.getBean("read", ReadPropertiesBean.class);
        System.out.println("readPropertiesBean = " + readPropertiesBean);
    }
}
