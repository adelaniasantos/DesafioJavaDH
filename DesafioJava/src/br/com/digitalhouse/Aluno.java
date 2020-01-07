package br.com.digitalhouse;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobrenome;
    private int codAluno;

    public Aluno(String nome, String sobrenome, int codAluno) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
        System.out.println("Aluno " + nome + " Cadastrado com sucesso");

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codAluno=" + codAluno +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

}
