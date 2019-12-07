import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("Kiki", 2);
        Aluno aluno2 = new Aluno("Jiji", 10);
        Aluno aluno3 = new Aluno("Cinzinha", 3);
        Aluno aluno4 = new Aluno("Billy", 5);

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno4);

        Aluno aluno5 = new Aluno("Pepê", 1);

        if(listaAlunos.contains(aluno5)) {
            System.out.println("Já tem");
        } else{
            System.out.println("Não tem. Vamos incluir");
            listaAlunos.add(aluno5);
            System.out.println(aluno5 + " incluído com sucesso!");
        }


    }
}
