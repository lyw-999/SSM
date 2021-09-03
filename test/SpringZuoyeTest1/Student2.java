package SpringZuoyeTest1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student2 {
        // 1.   练习spring的赋值 和依赖. 1)  新建一个  学生类,  属性为 常用类的   使用2 种方式   赋值
    private String name;
    private int age;
    private char sex;
    private List<String> teacherName;
    private Set<Integer>  lifemoney;
    private Map<String, Double> score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", teacherName=" + teacherName +
                ", lifemoney=" + lifemoney +
                ", score=" + score +
                '}';
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(List<String> teacherName) {
        this.teacherName = teacherName;
    }

    public Set<Integer> getLifemoney() {
        return lifemoney;
    }

    public void setLifemoney(Set<Integer> lifemoney) {
        this.lifemoney = lifemoney;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }
}

