package br.com.digitalhouse;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int idade;
    int rg;

    public Pessoa(String nome, int idade, int rg) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
    }



    @Override
    public boolean equals(Object novoObjeto) {
        if (this == novoObjeto){
            return true;
        }

        if (!(novoObjeto instanceof Pessoa)){

            return false;
        }

        Pessoa pessoa = (Pessoa) novoObjeto;
        return this.rg == pessoa.rg;

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rg=" + rg +
                '}';
    }


}
