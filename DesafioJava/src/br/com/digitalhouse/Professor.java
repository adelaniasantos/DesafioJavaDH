package br.com.digitalhouse;

public class Professor {
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codProfessor;

    public Professor(String nome, String sobrenome, int codProfessor, int tempoDeCasa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codProfessor = codProfessor;
        this.tempoDeCasa = tempoDeCasa;

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

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        if(existeCodigoProfessor(codProfessor)){

        }else{
            this.codProfessor = codProfessor;
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", tempoDeCasa=" + tempoDeCasa +
                ", codProfessor=" + codProfessor +
                '}';
    }

    private boolean existeCodigoProfessor(int codProfessor){
        return codProfessor == this.codProfessor;
    }
}
