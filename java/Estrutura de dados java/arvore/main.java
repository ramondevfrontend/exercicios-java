package arvore;

import arvore.model.Obj;

public class main {

    public static void main(String[] args){

        ArvoreBinaria<Obj> minhaarvore = new ArvoreBinaria<>();

        minhaarvore.inserir(new Obj(13));
        minhaarvore.inserir(new Obj(10));
        minhaarvore.inserir(new Obj(25));
        minhaarvore.inserir(new Obj(2));
        minhaarvore.inserir(new Obj(12));
        minhaarvore.inserir(new Obj(20));
        minhaarvore.inserir(new Obj(31));
        minhaarvore.inserir(new Obj(29));


        minhaarvore.exibirPosOrdem();
        minhaarvore.exibirPreOrdem();
    }
}
