package conceito.filas;

public class fila {

    private no refnoentradafila;

    public fila() {

        this.refnoentradafila = null;
    }

    public void enqueue(Object obj) {
        no novono = new no(obj);
        novono.setRefno(refnoentradafila);
        refnoentradafila = novono;
    }

    public Object first() {
        if(!this.isEmpty()) {
            no primeirono = refnoentradafila;
            while (true) {
                if(primeirono.getRefno() != null) {
                    primeirono = primeirono.getRefno();
                }else {
                    break;
                }
            }
            return primeirono;

        }
        return null;
    }

    public Object dequeue() {
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
            return primeirono;

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
                stringretorno += "[{" + noauxiliar + "}]---->";
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
