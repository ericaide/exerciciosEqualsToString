import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coca)) return false;
        Coca coca = (Coca) o;
        return Objects.equals(tamanho, coca.tamanho);
    }

}
