import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer numeroDeAluno;

    public Aluno(String nome, Integer numeroDeAluno) {
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroDeAluno, aluno.numeroDeAluno);
    }

    @Override
    public String toString() {
        return nome;
    }
}
