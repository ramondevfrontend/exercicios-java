package conceito.filas;

public class main {

    public static void main(String[] args) {

        fila minhafila = new fila();

        minhafila.enqueue(new no("primeiro"));
        minhafila.enqueue(new no("segundo"));
        minhafila.enqueue(new no("terceiro"));
        minhafila.enqueue(new no("quarto"));
        System.out.println(minhafila);

        System.out.println(minhafila.dequeue());
        System.out.println(minhafila);

        minhafila.enqueue(new no("penultimo"));
        System.out.println(minhafila);

        minhafila.enqueue(new no("ultimo"));
        System.out.println(minhafila);

        System.out.println(minhafila.first());
        System.out.println(minhafila);

    }
}
