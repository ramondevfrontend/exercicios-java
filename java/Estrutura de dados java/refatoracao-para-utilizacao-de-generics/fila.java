package conceito.filas;

public class fila<T> {

    private no<T> refnoentradafila;

    public fila() {

        this.refnoentradafila = null;
    }

    public void enqueue(T object) {
        no novono = new no(object);
        novono.setRefno(refnoentradafila);
        refnoentradafila = novono;
    }

    public T first() {
        if(!this.isEmpty()) {
            no primeirono = refnoentradafila;
            while (true) {
                if(primeirono.getRefno() != null) {
                    primeirono = primeirono.getRefno();
                }else {
                    break;
                }
            }
            return (T) primeirono.getObject();
        }
        return null;
    }

    public T dequeue() {
         if(!this.isEmpty()) {
            no primeirono = refnoentradafila;
            no noauxiliar = refnoentradafila;
            while (true) {
                if(primeirono.getRefno() != null) {
                    noauxiliar = primeirono;
                    primeirono = primeirono.getRefno();
                }else {
                    noauxiliar.setRefno(null);
                    break;
                }
            }
            return (T) primeirono.getObject();

        }
        return null;
    }

    public boolean isEmpty() {
        return refnoentradafila == null? true : false;

    }

    @Override
    public String toString() {

        String stringretorno = "";

        no noauxiliar = refnoentradafila;

        if(refnoentradafila != null) {
            while(true) {
                stringretorno += "[no{objeto=" + noauxiliar.getObject() + "}]---->";
                if(noauxiliar.getRefno() != null ){
                    noauxiliar = noauxiliar.getRefno();
                }else  {
                    stringretorno += "null";
                    break;
                }
            }

        }else {
            stringretorno = "null";
        }

        return stringretorno;

    }
}
