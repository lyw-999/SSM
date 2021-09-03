package SpringZuoyeTest;

// 我是人类
public class Person {

    public Person(){
        System.out.println(" 人诞生了 ");
    }
    //接口都是 抽象的
    private EatFood eatFood;

    public EatFood getEatFood() {
        return eatFood;
    }

    public void setEatFood(EatFood eatFood) {
        this.eatFood = eatFood;
    }

    public void eat(){
        System.out.println(" 今天吃的东西");
        eatFood.food();
    }
}
