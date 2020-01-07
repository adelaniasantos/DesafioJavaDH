package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunos = new ArrayList<>();;
    private List<Professor> listaProfessores = new ArrayList<>();;
    private List<Curso> listaCursos = new ArrayList<>(); ;
    private List<Matricula> listaMatriculas = new ArrayList<>();;

    public void registrarCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos){

       Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
       listaCursos.add(curso);
       System.out.println("Curso " + nome + " registrado com sucesso!");

    }

    public void excluirCurso(Integer codigoCurso){

        listaCursos.remove(codigoCurso);
        System.out.println("Curso excluido com sucesso!");
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int codProfessor, int qtdeDeHoras){

        ProfessoAdjunto profAdj = new ProfessoAdjunto(nome, sobrenome, codProfessor, 0, qtdeDeHoras);
        listaProfessores.add(profAdj);
        System.out.println("Professor adjunto ( "+ nome +" ) registrado com sucesso!");

    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codProfessor, String especialidade){

        ProfessorTitular profTitular = new ProfessorTitular(nome, sobrenome, codProfessor, 0, especialidade);
        listaProfessores.add(profTitular);
        System.out.println("Professor titular ( "+ nome +" ) registrado com sucesso!");
    }

    public void excluirProfessor(int codProfessor){

        listaProfessores.remove(codProfessor);
    }

    public boolean registrarAluno(String nome, String sobrenome, int codAluno){

        if(validaAluno(codAluno)){
            System.out.println("Erro - ja existe um aluno cadastrado com o codigo: "+ codAluno);
            return false;
        }

        Aluno aluno = new Aluno(nome, sobrenome, codAluno);
        listaAlunos.add(aluno);
        return true;
    }

    public void matricularAluno(int codigoAluno, int codigoCurso){

        if(!validaCurso(codigoCurso)){
            System.out.println("Codigo do Curso  ( "+ codigoCurso +" ) informado nao cadastrado, favor informar outro curso.");
        }else if(!validaAluno(codigoAluno)){
            System.out.println("Codigo Aluno ( "+ codigoAluno +" ) nao localizado, favor cadastrar o aluno.");
        }

        for (Curso curso : listaCursos) {
              if(curso.getCodCurso() == codigoCurso) {
                  for (Aluno aluno : listaAlunos) {
                      if (aluno.getCodAluno() == codigoAluno) {
                          if(curso.adicionarUmAluno(aluno)) {
                              Matricula matricula = new Matricula(aluno, curso);
                              listaMatriculas.add(matricula);
                              System.out.println("Aluno " + aluno.getNome()
                                                          + " matriculado com sucesso ao curso "
                                                          + curso.getNomeCurso());
                          }else{
                              System.out.println("Nao foi possível realizar a matrícula do aluno " +
                                                        aluno.getNome() + " porque nao ha vagas para o curso de " + curso.getNomeCurso());
                          }
                      }
                  }
              }
         }

    }



    public void alocarProfessores(int codigoCurso, int codigoProfessorTitular, int codigoProfessorAdjunto){

        if(!validaCurso(codigoCurso)){
            System.out.println("Codigo do Curso  ( "+ codigoCurso +" ) informado nao cadastrado, favor informar outro curso.");
        }else if(!validaProfessor(codigoProfessorTitular)){
            System.out.println("Professor Titular ( "+ codigoProfessorTitular +" ) nao localizado.");
        }else if(!validaProfessor(codigoProfessorAdjunto)){
            System.out.println("Professor Adjunto ( "+ codigoProfessorAdjunto +" ) nao localizado.");
        }

        for (Curso curso : listaCursos) {
            if(curso.getCodCurso() == codigoCurso) {
                for (Professor professor :listaProfessores){
                    if(professor.getCodProfessor() == codigoProfessorTitular) {
                        curso.setProfessorTitular((ProfessorTitular) professor);
                        System.out.println("Professro Titular (" + professor.getNome() + ") alocado com sucesso ao curso " + curso.getNomeCurso());
                    }else if(professor.getCodProfessor() == codigoProfessorAdjunto){
                        curso.setProfessoAdjunto((ProfessoAdjunto) professor);
                        System.out.println("Professro Adjunto (" + professor.getNome() + ") alocado com sucesso ao curso " + curso.getNomeCurso());
                    }
                }
            }
        }

    }

    public void consultarMatriculaAluno(int codigoAluno) {

        if (!validaAluno(codigoAluno)) {
            System.out.println("Codigo Aluno ( " + codigoAluno + " ) nao localizado, favor cadastrar o aluno.");
        }

        for (Matricula matricula : listaMatriculas) {
            if (matricula.getAluno().getCodAluno() == codigoAluno) {
                System.out.println("O(a) aluno(a) " + matricula.getAluno().getNome() + " esta matriculado(a) no curso " + matricula.getCurso().getNomeCurso());
            }
        }
    }

    private boolean validaProfessor(int codProfessor){
        for (Professor professor : listaProfessores) {
            if(professor.getCodProfessor() == codProfessor){
                return true;
            }
        }

        return false;
    }

    private boolean validaCurso(int codCurso){
        for (Curso curso : listaCursos) {
            if(curso.getCodCurso() == codCurso){
                return true;
            }
        }
        return false;
    }

    private boolean validaAluno(int codAluno){
        for (Aluno aluno : listaAlunos) {
            if(aluno.getCodAluno() == codAluno){
                return true;
            }
        }
        return false;
    }

    public void imprimirDados(){

        System.out.println("\nCURSOS-------------->");
        for (Curso curso : listaCursos) {
            System.out.println(curso.toString());
        }

        System.out.println("\nMATRICULAS-------------->");
        for (Matricula matricula : listaMatriculas) {
            System.out.println(matricula.toString());
        }

    }


}
