package spring06DI;

// 我是手机对象 我是次要的类 我是要被人类来使用的 . 来被依赖
public class Phone implements PlayGame{

    public Phone (){
        System.out.println("手机对象诞生了   ");
    }

    public void game(){
        System.out.println("手机打游戏   ");
    }


}
