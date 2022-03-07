package listaduplamenteencadeadas;

public class main {

    public static void main(String[] args) {

        listaduplamenteencadeada<String> minhalistaencadeada = new listaduplamenteencadeada<>();

        minhalistaencadeada.add("c1");
        minhalistaencadeada.add("c2");
        minhalistaencadeada.add("c3");
        minhalistaencadeada.add("c4");
        minhalistaencadeada.add("c5");
        minhalistaencadeada.add("c6");
        minhalistaencadeada.add("c7");
        System.out.println(minhalistaencadeada);

        minhalistaencadeada.remove(3);
        System.out.println(minhalistaencadeada);

        minhalistaencadeada.add(4,"99");
        System.out.println(minhalistaencadeada);


    }
}