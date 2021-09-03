package spring16aopstatic;

public class Laywer {

    private Beigao beigao;
    private String so;

    public Beigao getBeigao() {
        return beigao;
    }

    public void setBeigao(Beigao beigao) {
        this.beigao = beigao;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public void laywer(){
        String sos =beigao.getSos();
        this.so = "我是律师 我替被告申诉";
        System.out.println("原告律师 = " + so);

    }
}
