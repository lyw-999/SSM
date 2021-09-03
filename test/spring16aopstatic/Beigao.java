package spring16aopstatic;

public class Beigao {


    private String sos="我要申请律师";

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    private void lawyer(){
        System.out.println("我保持沉默 " + sos);
    }
}
