package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nomeCurso;
    private int codCurso;
    private ProfessorTitular professorTitular;
    private ProfessoAdjunto professoAdjunto;
    private int qtdeMaxAlunos;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private int qtdeTotalAlunos;

    public Curso(String nomeCurso, int codCurso, int qtdeMaxAlunos) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {

        if(existeCodigoCurso(codCurso)){
            System.out.println("Erro curso ja cadastrado.");
        }else{
            this.codCurso = codCurso;
            System.out.println("Curso cadastrado com suceso.");
        }

    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessoAdjunto getProfessoAdjunto() {
        return professoAdjunto;
    }

    public void setProfessoAdjunto(ProfessoAdjunto professoAdjunto) {
        this.professoAdjunto = professoAdjunto;
    }

    public int getQtdeMaxAlunos() {
        return qtdeMaxAlunos;
    }

    public void setQtdeMaxAlunos(int qtdeMaxAlunos) {
        this.qtdeMaxAlunos = qtdeMaxAlunos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    private boolean existeCodigoCurso(int codCurso){
        return codCurso == this.codCurso;
    }

    public Boolean adicionarUmAluno(Aluno umAluno){
        if(this.qtdeMaxAlunos > this.qtdeTotalAlunos){
            listaAlunos.add(umAluno);
            this.qtdeTotalAlunos = qtdeTotalAlunos + 1;
            return  true;
        }else{
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        listaAlunos.remove(umAluno);
        this.qtdeTotalAlunos = qtdeTotalAlunos - 1;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", codCurso=" + codCurso +
                ", professorTitular=" + professorTitular.toString() +
                ", professoAdjunto=" + professoAdjunto +
                ", qtdeMaxAlunos=" + qtdeMaxAlunos +
                ", listaAlunos=" + listaAlunos.toString() +
                ", qtdeTotalAlunos=" + qtdeTotalAlunos +
                '}';
    }
}
