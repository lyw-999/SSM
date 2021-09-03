package spring09basicdi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TeacherEL {
    private String name;
    private int age;
    private String friendName;
    private String loverName;
    private Double scroe;
    private String db;

    @Override
    public String toString() {
        return "TeacherEL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName='" + friendName + '\'' +
                ", loverName='" + loverName + '\'' +
                ", scroe=" + scroe +
                ", db='" + db + '\'' +
                '}';
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

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getLoverName() {
        return loverName;
    }

    public void setLoverName(String loverName) {
        this.loverName = loverName;
    }

    public Double getScroe() {
        return scroe;
    }

    public void setScroe(Double scroe) {
        this.scroe = scroe;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
