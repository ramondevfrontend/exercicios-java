package listaduplamenteencadeadas;

import java.util.concurrent.LinkedBlockingDeque;

public class listaduplamenteencadeada<T> {

    private noduplo<T> primeirono;
    private noduplo<T> ultimono;

    private int tamanholista = 0;

    public listaduplamenteencadeada() {

        this.primeirono = null;
        this.ultimono = null;
        this.tamanholista = 0;

    }

    public T get(int index) {
        return this.getno(index).getConteudo();

    }

    public void add(T elemento) {

        noduplo<T> novono = new noduplo<>(elemento);
        novono.setNoproximo(null);
        novono.setNoprevio(ultimono);
        if(primeirono == null ) {
            primeirono = novono;
        }
        if(ultimono != null  ) {
            ultimono.setNoproximo(novono);
        }
        ultimono = novono;
        tamanholista++;

    }

    public void add(int index, T elemento) {
        noduplo<T> noauxiliar = getno(index);
        noduplo<T> novono = new noduplo<>(elemento);
        novono.setNoproximo(noauxiliar);

        if(novono.getNoproximo() != null) {
            novono.setNoprevio(noauxiliar.getNoprevio());
            novono.getNoproximo().setNoprevio(novono);
        }else {
            novono.setNoprevio(ultimono);
            ultimono = novono;
        }

        if(index == 0) {
            primeirono = novono;
        }else {
            novono.getNoprevio().setNoproximo(novono);
        }

        tamanholista++;

    }

    public void remove(int index) {
        if(index == 0) {
            primeirono = primeirono.getNoproximo();
            if(primeirono != null) {
                primeirono.setNoprevio(null);

            }
        }else {
            noduplo<T> noauxiliar = getno(index);
            noauxiliar.getNoprevio().setNoproximo(noauxiliar.getNoproximo());
            if(noauxiliar != ultimono) {
                noauxiliar.getNoprevio().setNoprevio(noauxiliar.getNoprevio());
            }else {
                ultimono = noauxiliar;

            }

        }
        this.tamanholista--;

    }

    private noduplo<T> getno(int index) {
        noduplo<T> noauxiliar = primeirono;
        for(int i = 0; (i < index) && (noauxiliar != null); i++) {
            noauxiliar = noauxiliar.getNoproximo();

        }
        return noauxiliar;
    }

    public int size() {
        return this.tamanholista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        noduplo<T> noauxiliar = primeirono;
        for(int i = 0; i < size(); i++) {
            strRetorno += "[no{conteudo=" + noauxiliar.getConteudo() + "}]---->";
            noauxiliar = noauxiliar.getNoproximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
