package spring20aop01;

public class RegServiceImpl implements RegService{

    @Override
    public void addUser() {
        System.out.println("调用了 dao层 这个是会员的注册功能");
        //注册完毕后 回馈给用户 进行通知
    }

    @Override
    public void login() {
        System.out.println("调用了 dao层 这是登录功能");
        // 在登录之前发一个通知
    }

    @Override
    public void transMoney() {
        int i= 1/0;
        System.out.println("调用了dao层 转账");
    }
}
