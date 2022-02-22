package projetono;

/**
 * Conceito de nó e Encadeamento em nó
 */
public class no {

    private String conteudo;
    private no proximono;

    public no(String conteudo) {
        this.proximono = null;
        this.conteudo = conteudo;

    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public no getProximono() {
        return proximono;
    }

    public void setProximono(no proximono) {
        this.proximono = proximono;
    }

    @Override
    public String toString() {
        return "no{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
