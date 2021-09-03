package SpringZuoyeTest3;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    public void insert(){
        System.out.println(" 我是dao层的 添加方法");
    }
    public void delete(){
        System.out.println(" 我是dao层的 删除方法");
    }
    public void update(){
        System.out.println(" 我是dao层的 修改方法");
    }
    public void selectAll(){
        System.out.println(" 我是dao层的 全查方法");
    }
}
