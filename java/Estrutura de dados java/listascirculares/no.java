package listascirculares;

public class no<T> {

    private T conteudo;
    private no<T> noProximo;

    public void setNoProximo() {

    }

    public no(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public no<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(no<T> noProximo) {
        this.noProximo = noProximo;
    }

    @Override
    public String toString() {
        return "no{" +
                "conteudo=" + conteudo +
                '}';
    }

}
