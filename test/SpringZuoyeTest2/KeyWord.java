package SpringZuoyeTest2;

public class KeyWord {

    private Cpu cpu;


    public  KeyWord(Cpu cpu) {
        this.cpu = cpu;
    }

    public KeyWord(){
        System.out.println("我是键盘 ，键盘对象诞生了");
    }

    public void knock(){
        System.out.println("我敲了键盘");
        cpu.accept();
    }
}
