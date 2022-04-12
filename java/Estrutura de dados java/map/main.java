import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args){

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Ramon");
        aluno.put("Idade", "35");
        aluno.put("Media", "8.9");
        aluno.put("Turma", "1232a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Lorrana");
        aluno2.put("Idade", "27");
        aluno2.put("Media", "9.9");
        aluno2.put("Turma", "1231b");

        listaAlunos.add(aluno2);

        System.out.println(aluno2);

        System.out.println(aluno.containsKey("Nome"));





    }
}
