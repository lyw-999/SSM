package spring02ouhe;

import org.junit.Test;

public class spting02ouohe  {

    @Test
    public void ouHeTest(){
        //如果使用电脑传数据
        Computer computer = new Computer();
        computer.usbData();
        //如果使用电视传数据
        MyTv myTv = new MyTv();
        myTv.usbData();

        // 更新接口后，代码优化了，解耦1次
        //Usb u=  new Computer();
        //Usb u= new MyTv();

        Usb u = new Mp4();
            u.usbData( );


        // 需求1:现在、new. Computer();... new MyTv(); 都有usbData的功能。
        // 问题:直接修改代码修改最比较大。
        // 想把Compter 类不用，修改成Tv,
        // 那么需要把usbData. 方法提取成。 接口.. 然后使用多态的思想进行代码更新，解耦1次
        // 第一次使用接口,多态的思想解隅，好处是，可以多次修改代码不用改变量了，直接一个u就可以代替

    }

}
