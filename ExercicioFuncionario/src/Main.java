import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        Funcionario func1 = new Funcionario("Kiki", 20);
        Funcionario func2 = new Funcionario("Jiji", 10);
        Funcionario func3 = new Funcionario("Pepe", 22);
        Funcionario func4 = new Funcionario("Ted", 2);

        listaFuncionarios.add(func1);
        listaFuncionarios.add(func2);
        listaFuncionarios.add(func3);
        listaFuncionarios.add(func4);

        Funcionario func5 = new Funcionario("Mimi", 50);

        if (listaFuncionarios.contains(func5)) {
            System.out.println("Já existe esse funcionário");
        } else {
            System.out.println("Não existe esse funcionário ainda");
            listaFuncionarios.add(func5);
            System.out.println("Acabamos de incluir o funcionário " + func5);
        }
    }
}
