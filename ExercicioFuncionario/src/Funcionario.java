import java.util.Objects;

public class Funcionario {

    private String nome;
    private Integer numeroDeRegistro;

    public Funcionario(String nome, Integer numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(numeroDeRegistro, that.numeroDeRegistro);
    }

    @Override
    public String toString() {
        return nome;
    }
}
