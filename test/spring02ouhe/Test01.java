package spring02ouhe;

import org.junit.Test;

public class Test01 {

    @Test
    public void test01(){
        try {
            String [] ss = {"Computer","Mp4","MyTv"};
            for (String s : ss) {
                Class< Usb> aClass = (Class<Usb>) Class.forName("spring02ouhe."+s);

                      aClass.newInstance().usbData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
