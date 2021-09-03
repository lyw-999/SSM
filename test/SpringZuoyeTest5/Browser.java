package SpringZuoyeTest5;

public class Browser {

    private boolean goguge =false;


    public boolean isGoguge() {
        return goguge;
    }

    public void setGoguge(boolean goguge) {
        this.goguge = goguge;
    }

    public void go(){
        System.out.println("原来浏览器去谷歌"+this.goguge);
    }
}
