package listaencadeada;

public class listaencadeada<T> {

    no<T> referenciaentrada;

    public listaencadeada() {
        this.referenciaentrada = null;
    }

    public void add(T conteudo) {
        no<T> novono = new no<>(conteudo);
        if(this.isEmpty()) {
            referenciaentrada = novono;
            return;
        }

        no<T> noauxiliar = referenciaentrada;
        for(int i = 0; i < this.size()-1; i++) {
             noauxiliar = noauxiliar.getProximono();
        }

        noauxiliar.setProximono(novono);
    }

    public T get(int index) {
        return getno(index).getConteudo();

    }

    private no<T> getno(int index) {
        if(index >= size()) {
            int ultimoindice = size() - 1 ;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + "desta lista. Esta lista só vai até o índice " + ultimoindice + '.');
        }

        validaindice(index);
        no<T> noauxiliar = referenciaentrada;
        no<T> noretorno = null;

        for (int i = 0; i < this.size()-1; i++) {
            noretorno = noauxiliar;
            noauxiliar = noauxiliar.getProximono();
        }

        return noretorno;
    }

    public T remove(int index) {
        no<T> nopivor = this.getno(index);
        if(index == 0 ) {
            referenciaentrada = nopivor.getProximono();
            return nopivor.getConteudo();
        }

        no<T> noanterior = getno(index - 1);

    }

    public int size() {
        int tamanholista = 0;
        no<T> referenciaauxiliar = referenciaentrada;
        while (true) {
            if(referenciaauxiliar != null) {
                tamanholista++;
                if(referenciaauxiliar.getProximono() != null) {
                    referenciaauxiliar = referenciaauxiliar.getProximono();

                }else {
                    break;
                }

            }else {
                break;
            }
        }

        return tamanholista;
    }

    private void validaindice(int index) {
        if(index >= size()) {
            int ultimoindice = size() - 1 ;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + "desta lista. Esta lista só vai até o índice " + ultimoindice + '.');
        }
    }

    public boolean isEmpty() {
        return referenciaentrada == null ? true : false;
    }
}
