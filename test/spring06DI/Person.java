package spring06DI;

// 我是人类
public class Person  {

    public Person (){
        System.out.println("人在 容器中诞生了");
    }
    //接口都是 抽象的
    private PlayGame playGame;

    public PlayGame getPlayGame() {
        return playGame;
    }

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }

    //    private Phone phone;//人依赖了 手机 所以 人就拥有了 手机
//
//    public Phone getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Phone phone) {// set是给别人看的 让别人给你东西的
//        this.phone = phone;
//    }
//
    public void play(){
        System.out.println("人玩的方法");
        playGame.game();
    //    phone.geme();
    //    psp.game();
    }
}
