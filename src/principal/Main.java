package principal;

import gestao.Universidade;
import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Pessoa;
import modelo.Professor;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Main {
    static void main(String[] args) {

        Universidade universidade = new Universidade();

        Professor prof1 = new Professor("Carlos Silva", "111.111.111-11", "carlos@uni.edu", "REG123", "Matemática", "senhaProf1");
        Professor prof2 = new Professor("Ana Souza", "222.222.222-22", "ana@uni.edu", "REG456", "Programação", "senhaProf2");
        universidade.cadastrarProfessor(prof1);
        universidade.cadastrarProfessor(prof2);

        Disciplina disc1 = new Disciplina("MAT01", "Cálculo I", 60, prof1);
        Disciplina disc2 = new Disciplina("PROG01", "Lógica de Programação", 80, prof2);
        Disciplina disc3 = new Disciplina("PROG02", "Banco de Dados", 80, prof2);

        Curso cursoTI = new Curso("TI01", "Análise e Desenvolvimento de Sistemas");
        cursoTI.adicionarDisciplina(disc1);
        cursoTI.adicionarDisciplina(disc2);
        cursoTI.adicionarDisciplina(disc3);
        universidade.cadastrarCurso(cursoTI);

        Aluno aluno1 = new Aluno("João Pedro", "333.333.333-33", "joao@aluno.edu", "MAT001", "Análise e Desenvolvimento de Sistemas", "senhaAluno1");
        Aluno aluno2 = new Aluno("Maria Clara", "444.444.444-44", "maria@aluno.edu", "MAT002", "Análise e Desenvolvimento de Sistemas", "senhaAluno2");
        Aluno aluno3 = new Aluno("Lucas Fernandes", "555.555.555-55", "lucas@aluno.edu", "MAT003", "Análise e Desenvolvimento de Sistemas", "senhaAluno3");
        universidade.cadastrarAluno(aluno1);
        universidade.cadastrarAluno(aluno2);
        universidade.cadastrarAluno(aluno3);

        aluno1.matricular(disc1);
        aluno1.matricular(disc2);

        aluno2.matricular(disc2);
        aluno2.matricular(disc3);

        aluno3.matricular(disc3);

        cursoTI.listarDisciplinas();

        aluno2.listarDisciplinasMatriculadas();

        System.out.println("\nTeste de Autenticação");
        System.out.println("Autenticação Aluno 1 (senha correta): " + aluno1.autenticar("senhaAluno1"));
        System.out.println("Autenticação Professor 2 (senha incorreta): " + prof2.autenticar("senhaIncorreta123"));

        System.out.println("\nDemonstração de Polimorfismo");
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno1);
        pessoas.add(aluno2);
        pessoas.add(aluno3);
        pessoas.add(prof1);
        pessoas.add(prof2);

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
            System.out.println("-");
        }
    }
}