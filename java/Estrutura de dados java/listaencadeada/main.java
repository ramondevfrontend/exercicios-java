package listaencadeada;

public class main {

    public static void main(String[] args) {

        listaencadeada<String> minhalistaencadeada = new listaencadeada<String>();

        minhalistaencadeada.add("teste 1");
        minhalistaencadeada.add("teste 2");
        minhalistaencadeada.add("teste 3");
        minhalistaencadeada.add("teste 4");
        minhalistaencadeada.add("teste 5");
        minhalistaencadeada.add("teste 6");
        minhalistaencadeada.add("teste 7");

        System.out.println(minhalistaencadeada.get(0));
        System.out.println(minhalistaencadeada.get(1));
        System.out.println(minhalistaencadeada.get(2));
        System.out.println(minhalistaencadeada.get(3));
        System.out.println(minhalistaencadeada.get(4));
        System.out.println(minhalistaencadeada.get(5));
        System.out.println(minhalistaencadeada.get(6));

        System.out.println(minhalistaencadeada);

        System.out.println(minhalistaencadeada.remove(4));

        System.out.println(minhalistaencadeada);
    }
}
