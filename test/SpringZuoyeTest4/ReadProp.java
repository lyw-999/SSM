package SpringZuoyeTest4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ReadProp {


        @Value("#{prop.name}")
        private String name;
        @Value("25")
        private int age;

        @Value("#{prop.sex}")
        private String sex;

        @Value("十年")
        private String Cname;

    @Override
    public String toString() {
        return "ReadProp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", Cname='" + Cname + '\'' +
                '}';
    }
}
