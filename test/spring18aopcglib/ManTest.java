package spring18aopcglib;

import org.junit.Test;

public class ManTest {

    @Test
    public void test01(){
        Man erzi = new CglibFactory().cglibCreator();//多态类的父类指向子类
        int dream = erzi.dream();
        System.out.println("儿子的高考分数 = " + dream);
    }
}
