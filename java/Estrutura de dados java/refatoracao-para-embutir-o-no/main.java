package conceito.filas;

public class main {

    public static void main(String[] args) {

        fila minhafila = new fila();

        minhafila.enqueue(1);
        minhafila.enqueue("segundo");
        minhafila.enqueue(true);
        minhafila.enqueue("quarto");
        System.out.println(minhafila);

        System.out.println(minhafila.dequeue());
        System.out.println(minhafila);

        minhafila.enqueue("penultimo");
        System.out.println(minhafila);

        minhafila.enqueue("ultimo");
        System.out.println(minhafila);

        System.out.println(minhafila.first());
        System.out.println(minhafila);

    }
}
