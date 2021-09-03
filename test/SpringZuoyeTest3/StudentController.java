package SpringZuoyeTest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    //查询添加的方法
    public void insert(){
        studentService.insert();
    }
    //查询删除的方法
    public void delete(){

        studentService.delete();
    }

    //查询修改的方法
    public void update(){

        studentService.update();
    }
    //查询全部的方法
    public void selectAll(){

        studentService.selectAll();
    }

}
