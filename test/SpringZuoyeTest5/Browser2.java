package SpringZuoyeTest5;

public class Browser2 {

    private boolean goguge= false;


    public boolean isGoguge() {
        return goguge;
    }

    public void setGoguge(boolean goguge) {
        this.goguge = goguge;
    }


    public boolean go(){
        System.out.println("去一趟谷歌"+this.goguge);

        return this.goguge;
    }
}
