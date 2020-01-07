package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager dh = new DigitalHouseManager();

        System.out.println("\n-----------------Registrar dois professores titulares");
        dh.registrarProfessorTitular("Claudete","Souza", 10, "PHP");
        dh.registrarProfessorTitular("Mauro", "Castelo", 13, "Java");

        System.out.println("\n-----------------Registrar dois professores adjuntos");
        dh.registrarProfessorAdjunto("Maria", "Suzete", 20, 50);
        dh.registrarProfessorAdjunto("Lucas", "Silva", 23, 40);

        System.out.println("\n-----------------Registrar dois cursos");
        dh.registrarCurso("Full Stack", 20001, 3);
        dh.registrarCurso("Android", 20002, 2);

        System.out.println("\n-----------------Alocar um professor titular e um adjunto");
        dh.alocarProfessores(20001, 10, 20);
        dh.alocarProfessores(20001, 13, 23);
        dh.alocarProfessores(20002, 10, 20);
        dh.alocarProfessores(20002, 13, 23);

        System.out.println("\n-----------------Matricular dois alunos no curso de Full Stack");
        dh.registrarAluno("Adelania", "Santos", 1001);
        dh.matricularAluno(1001, 20001);
        dh.registrarAluno("Rodrigo", "Lulio", 1002);
        dh.matricularAluno(1002, 20001);

        System.out.println("\n-----------------Matricular três alunos no curso de Android.");
        dh.registrarAluno("Rosana", "Almeida", 1003);
        dh.matricularAluno(1003, 20002);
        dh.registrarAluno("Bruna", "Lira", 1004);
        dh.matricularAluno(1004, 20002);
        dh.registrarAluno("Carlos", "Alves", 1005);
        dh.matricularAluno(1005, 20002);

        System.out.println("\n-----------------Consultar Matricula aluno.");
        dh.consultarMatriculaAluno(1003);

       dh.imprimirDados();

    }
}
