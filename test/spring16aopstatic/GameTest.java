package spring16aopstatic;

import org.junit.Test;

public class GameTest {
    //测试静态代理
    @Test
    public void test01(){

        Game wangzhe = new Game();
        JiaSuQi xunyou = new JiaSuQi();

        xunyou.setGame(wangzhe);//set注入 王者注入了迅游,迅游包含了王者 巡游才是主体类
        xunyou.conNet(); // 调用都调用的是 主体类
    }

    @Test
    public void test02(){

        Beigao zk = new Beigao();
        Laywer zs = new Laywer();

    }
}
