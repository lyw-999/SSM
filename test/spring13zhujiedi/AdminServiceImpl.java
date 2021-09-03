package spring13zhujiedi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

 //   @Resource  //相当于我们 的xml中的注入  注解1: tomcat 提供的
    @Autowired   // 注解2: spring 提供的  主要用这个,spring体系
    private AdminDAO adminDAO;

    @Override
    public void selectAll() {
        // service 层调用dao层 service 层依赖了dao层
        adminDAO.selectAll();
    }
}
