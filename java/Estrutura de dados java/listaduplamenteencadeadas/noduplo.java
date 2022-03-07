package listaduplamenteencadeadas;

public class noduplo<T> {

    private T conteudo;
    private noduplo<T> noproximo;
    private noduplo<T> noprevio;

    public noduplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public noduplo<T> getNoproximo() {
        return noproximo;
    }

    public void setNoproximo(noduplo<T> noproximo) {
        this.noproximo = noproximo;
    }

    public noduplo<T> getNoprevio() {
        return noprevio;
    }

    public void setNoprevio(noduplo<T> noprevio) {
        this.noprevio = noprevio;
    }

    @Override
    public String toString() {
        return "noduplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
