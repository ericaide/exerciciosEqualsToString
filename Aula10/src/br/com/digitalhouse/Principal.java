package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa("João Camargo", 18, 23);
        Pessoa jess = new Pessoa("Jess", 18, 3);

        if(joao.equals(jess)){
            System.out.println("Pessoas iguais");
        } else{
            System.out.println("Pessoas diferentes");
        }

        System.out.println(joao.toString());


    }
}
