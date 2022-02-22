package conceito.filas;

public class no {


    private Object object;
    private  no refno;

    public no() {
    }

    public no(Object object) {

        this.refno = null;
        this.object = object;

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
                "object=" + object +
                '}';
    }
}
