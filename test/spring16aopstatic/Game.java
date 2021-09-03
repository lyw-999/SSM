package spring16aopstatic;

// 目标对象 他的方法不行,想让另外一个对象帮他
public class Game {

    private int wangsu =460;

    public int getWangsu() {
        return wangsu;
    }

    public void setWangsu(int wangsu) {
        this.wangsu = wangsu;
    }

    // 目的: 目标对象自身的方法
    public void conNet(){
        System.out.println("游戏本身的网速是"+this.getWangsu());
    }
}
