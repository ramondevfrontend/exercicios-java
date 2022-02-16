package projetopilha;

public class main {

    public static void main(String[] args) {

       pilha minhapilha = new pilha();
       minhapilha.push(new no(1));
       minhapilha.push(new no(2));
       minhapilha.push(new no(3));
       minhapilha.push(new no(4));
       minhapilha.push(new no(5));
       minhapilha.push(new no(6));
       System.out.println(minhapilha);

       System.out.println(minhapilha.pop());
       System.out.println(minhapilha);

       minhapilha.push(new no(99));
       System.out.println(minhapilha);


    }
}
