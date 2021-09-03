package SpringZuoyeTest5;

import SpringZuoyeTest5.Browser;
import org.junit.Test;

public class BrowserTest {

    @Test
    public void test01() {

        Browser qq = new Browser(); //QQ浏览器
        Vpn vpn = new Vpn(); // vpn
        vpn.setBrowser(qq);
        vpn.go();
    }
}
