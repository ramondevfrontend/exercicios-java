package conceito.filas;

public class no<T> {

    private T object;
    private  no<T> refno;

    public no() {
    }

    public no(T object) {

        this.refno = null;
        this.object = object;

    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
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
