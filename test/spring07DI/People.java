package spring07DI;

public class People {

    private Pad pad;

    public People(){
        System.out.println("人对象被创建了");
    }

    public People(Pad pad){
    this.pad=pad;

    }
    public void play(){
        System.out.println("人玩的方法");
        pad.game();
    }
}
