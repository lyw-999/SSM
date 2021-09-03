package SpringZuoyeTest5;


public class Vpn {
        private Browser browser;
        private boolean intoguge;

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public boolean isIntoguge() {
        return intoguge;
    }

    public void setIntoguge(boolean intoguge) {
        this.intoguge = intoguge;
    }

    public void go(){
      //  intoguge = browser.isGoguge();
        this.intoguge = true;
        System.out.println("现在去谷歌 = " + intoguge);
        }


}
