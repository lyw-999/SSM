package spring15zhujiereadprop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OneBean {

    @Value("#{pro.name}")
    private String name;
    @Value("18")
    private int age;

    @Override
    public String toString() {
        return "OneBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
