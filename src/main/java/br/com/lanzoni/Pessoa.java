package br.com.lanzoni;

import org.springframework.stereotype.Component;

@Component
public class Pessoa {

    private String name;
    private int idade;

    public Pessoa() {
        System.out.println("Pessoa nasceu!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }
}
