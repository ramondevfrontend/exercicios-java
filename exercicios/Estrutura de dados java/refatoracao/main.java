package refatoração;

public class main {

    public static void main(String[] args) {

        no<String> no1 = new no<>("Conteúdo no1");

        no<String> no2 = new no<>("Conteúdo no2");
        no1.setProximono(no2);

        no<String> no3 = new no<>("Conteúdo no3");
        no2.setProximono(no3);

        no<String> no4 = new no<>("Conteúdo no4");
        no3.setProximono(no4);

        System.out.println(no1);
        System.out.println(no1.getProximono());
        System.out.println(no1.getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono());
        System.out.println(no1.getProximono().getProximono().getProximono().getProximono());
    }
}
