package projetopilha;

public class pilha {

    private no refnoEntradaPilha;

    public pilha() {
        this.refnoEntradaPilha = null;
    }

    public no top(){
        return refnoEntradaPilha;
    }

    public void push(no Novono){
        no refauxiliar = refnoEntradaPilha;
        refnoEntradaPilha = Novono;
        refnoEntradaPilha.setRefno(refauxiliar);
    }

    public no pop(){
        if(!this.isEmpty()){
            no nopoped = refnoEntradaPilha;
            refnoEntradaPilha = refnoEntradaPilha.getRefno();
            return nopoped;

        }
        return null;
    }

    public boolean isEmpty(){
        if(refnoEntradaPilha == null){
            return true;
        }
        return false;
        // ou return refnoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String Stringretorno = "-----------\n";
        Stringretorno += "  pilha \n";
        Stringretorno += "-----------\n";

        no noauxiliar = refnoEntradaPilha;

        while(true){
            if(noauxiliar != null){
                Stringretorno += "[no{dado=" + noauxiliar.getDado() +"}]\n";
                noauxiliar = noauxiliar.getRefno();

            }else{
                break;
            }
        }
        Stringretorno += "===========\n";
        return  Stringretorno;
    }

}
