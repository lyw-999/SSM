package spring14zhujie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 注解版的常用类型注入
 */
@Component
public class Teacher3 {
    @Value("王小明")
    private String name;
    @Value("19")
    private int age;
    //  余下的就是 集合 需要读取xml注入
    @Value("#{friendNames}")
    private List<String> friendName;
    @Value("#{loverNames}")
    private Set<String> loverName;
    @Value("#{scores}")
    private Map<String,Double> score;
    @Value("#{prop}")
    private Properties db;
    @Value("#{url.name}")
    private String url;

    @Override
    public String toString() {
        return "Teacher3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName=" + friendName +
                ", loverdName=" + loverName +
                ", score=" + score +
                ", db=" + db +
                ", url='" + url + '\'' +
                '}';
    }
}
