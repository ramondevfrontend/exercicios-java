package projetopilha;

public class no {

    private int dado;
    private no refno = null;

    public no() {
    }

    public no(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public no getRefno() {
        return refno;
    }

    public void setRefno(no refno) {
        this.refno = refno;
    }

    @Override
    public String toString() {
        return "no{" +
                "dado=" + dado +
                '}';
    }
}
