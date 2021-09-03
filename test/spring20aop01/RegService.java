package spring20aop01;

public interface RegService {
    // 注册一个会员
  public  void addUser(); //切入点

    //登录  登录 之前 发个短信验证
    public void login();

    //环绕通知
    public void transMoney();
}
