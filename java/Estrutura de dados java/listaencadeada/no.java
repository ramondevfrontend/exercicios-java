package listaencadeada; // Implementação da classe no

public class no<T> {

    private T conteudo;
    private no proximono;

    public no() {
        this.proximono = null;
    }

    public no(T conteudo) {
        this.conteudo = conteudo;
        this.proximono = null;
    }

    public no(T conteudo, no proximono) {
        this.conteudo = conteudo;
        this.proximono = proximono;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
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
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringencadeado() {
        String str = "no{" +
                "conteudo=" + conteudo +
                '}';

        if(proximono != null) {
            str += "->" + proximono.toString();

        }else {
            str += "-> null";
        }
        return str;
    }
}
