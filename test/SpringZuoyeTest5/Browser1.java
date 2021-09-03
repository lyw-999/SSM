package SpringZuoyeTest5;

public class Browser1 implements ConnGoogle{
    private boolean goguge=false;

    public boolean isGoguge() {
        return goguge;
    }

    public void setGoguge(boolean goguge) {
        this.goguge = goguge;
    }

    @Override
    public boolean go() {
        System.out.println("原来去谷歌 = " + goguge);
        return this.goguge;
    }
}
