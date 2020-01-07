package br.com.digitalhouse;

public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, int codProfessor, int tempoDeCasa, String especialidade) {
        super(nome, sobrenome, codProfessor, tempoDeCasa);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {

        return super.toString() +
                "{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }
}
