package spring16aopstatic;

/**
 * 代理对象 用于增强 目标对象的方法
 */
public class JiaSuQi {
    private Game game; //代理类才是主体类,代理对象 依赖了主体对象,代理对象包含了目标对象
    private int  ws;

    //代理对象的方法 而且必须和目标对象一样  因为代理对象也要有目标对象的方法 不然怎么加强呢
    public void conNet(){
        //这个方法要承接  目标对象的方法
    int wangsu = game.getWangsu(); //目标对象的网速
    this.ws= wangsu - 400;
        System.out.println("现在的网速是 = " + this.ws);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }
}
