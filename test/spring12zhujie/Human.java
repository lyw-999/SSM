package spring12zhujie;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//  @Component 叫做通用注解     四大注解
//  @Component  这个注解就等于在xml中写了 bean标签  <bean id="human" class="spring12zhujie.Human"> </bean>
//  @Controller  等于 @Component 用在controller层
//  @Service   等于 @Component 用在service层
//@Repository("ren")   // 可以起别名, 如果不起,那么这个id 就是 类名的首字母小写.
@Repository  // 等于 @Component 用在dao层  但是一般不用 因为dao有xml映射
//
//@Scope("prototype") // 加上这个就是 原形/多例
//@Lazy  //加这个 就是懒加载


public class Human {
    public Human(){
        System.out.println(" human对象诞生了");
    }

    @PostConstruct // 构造器之前的方法 意思就是 生命周期
    //    <bean id="human" class="spring12zhujie.Human" scope="prototype" init-method="initShow" destroy-method="desctory"></bean>

    public void  inintShow(){
        System.out.println("人一出生就会哭");
    }

    @PreDestroy // 死亡方法   <bean id="human" class="spring12zhujie.Human" scope="prototype" init-method="initShow" destroy-method="desctory"></bean>
    public void desctory(){
        System.out.println("地球挂掉之前");
    }
}
