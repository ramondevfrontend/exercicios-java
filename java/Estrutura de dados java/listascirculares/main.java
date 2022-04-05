package listascirculares;

public class main {

    public static void main(String[] args) {
        listacircular<String> minhalistacircular = new listacircular<>();

        minhalistacircular.add("c0");
        System.out.println(minhalistacircular);

        minhalistacircular.remove(0);
        System.out.println(minhalistacircular);

        minhalistacircular.add("c1");
        System.out.println(minhalistacircular);

        minhalistacircular.add("c2");
        minhalistacircular.add("c3");
        minhalistacircular.add("c4");
        System.out.print(minhalistacircular);
/*
        System.out.print(minhalistacircular.get(0));
        System.out.println(minhalistacircular.get(1));
        System.out.println(minhalistacircular.get(2));
        System.out.println(minhalistacircular.get(3));
        System.out.println(minhalistacircular.get(4));
*/
        for(int i = 0; i < 20; i++){
            System.out.println(minhalistacircular.get(i));

        }


    }
}
