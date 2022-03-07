package listascirculares;

public class listacircular<T> {

    private no<T> cabeca;
    private no<T> cauda;
    private int tamanholista;

    public listacircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanholista = 0;
    }

    public void add(T conteudo){
        no<T> novono = new no<>(conteudo);
        if(this.tamanholista == 0){
            this.cabeca = novono;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else{
            novono.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novono);
            this.cauda = novono;
        }
        this.tamanholista++;
    }

    public void remove(int index){
        if(index >= this.tamanholista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
        no<T> noauxiliar = this.cauda;
        if(index == 0 ){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo();
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noauxiliar = noauxiliar.getNoProximo();
            }
            noauxiliar.setNoProximo(noauxiliar.getNoProximo().getNoProximo());
        }
        this.tamanholista--;
    }

    public T get(int index){
        return this.getno(index).getConteudo();
    }

    private no<T> getno(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");

        if (index == 0 ){
            return this.cauda;
        }

        no<T> noauxiliar = this.cauda;
        for(int i = 0; (i < index) && (noauxiliar != null); i++){
            noauxiliar = noauxiliar.getNoProximo();
        }
        return noauxiliar;
    }

    public boolean isEmpty(){
        return this.tamanholista == 0 ? true : false;

    }

    public int size(){
        return this.tamanholista;
    }

    @Override
    public String toString() {
        String strretorno = "";

        no<T> noauxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            strretorno += "[no{conteudo=" + noauxiliar.getConteudo() + "}]---->";
            noauxiliar = noauxiliar.getNoProximo();
        }

        strretorno += this.size() != 0 ? "(retorna ao inicio)" : "[]";

        return strretorno;
    }
}
