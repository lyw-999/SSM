package SpringZuoyeTest5;

import org.junit.Test;

public class Browser3Test {


    @Test
    public void test01(){
        Browser2 sll = new CglibFactory().cglibCreator();//多态类的父类指向子类
        boolean go =sll.go();
        System.out.println("现在去浏览器 = " + go);
    }
}
