package refatoração;

/**
 *
 * Refatoração da Classe No
 * @param <T>
 */

public class no<T> {

    private T conteudo;
    private no<T> proximono;

    public no(T conteudo) {
        this.proximono = null;
        this.conteudo = conteudo;

    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public no<T> getProximono() {
        return proximono;
    }

    public void setProximono(no<T> proximono) {
        this.proximono = proximono;
    }

    @Override
    public String toString() {
        return "no{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}