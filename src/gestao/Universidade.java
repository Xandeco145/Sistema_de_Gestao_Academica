package gestao;

import modelo.Aluno;
import modelo.Curso;
import modelo.Professor;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private final List<Aluno> alunos;
    private final List<Professor> professores;
    private final List<Curso> cursos;

    public Universidade() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void cadastrarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void cadastrarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void listarAlunos() {
        System.out.println("\nLista de Alunos:");
        for (Aluno a : alunos) {
            System.out.println(a.getNome() + " (Matrícula: " + a.getMatricula() + ")");
        }
    }

    public void listarProfessores() {
        System.out.println("\nLista de Professores:");
        for (Professor p : professores) {
            System.out.println(p.getNome() + " (Registro: " + p.getRegistro() + ")");
        }
    }

    public void listarCursos() {
        System.out.println("\nLista de Cursos:");
        for (Curso c : cursos) {
            System.out.println(c.getNome() + " (Código: " + c.getCodigo() + ")");
        }
    }
}
