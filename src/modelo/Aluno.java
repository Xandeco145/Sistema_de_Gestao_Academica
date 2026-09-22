package modelo;

import interfaces.Autenticavel;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Aluno extends Pessoa implements Autenticavel {
    private String matricula;
    private String curso;
    private String senha;
    private final List<Disciplina> disciplinas;

    public Aluno(String nome, String cpf, String email, String matricula, String curso, String senha) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.curso = curso;
        this.senha = senha;
        this.disciplinas = new ArrayList<>();
    }
    public void matricular(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void cancelarMatricula(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public void listarDisciplinasMatriculadas(){
        System.out.println("\nDisciplinas do Aluno: " + getNome());
        for (Disciplina d : disciplinas) {
            System.out.println(d.getCodigo() + " - " + d.getNome() +
                    "\nProf. Responsável: " + d.getProfessorResponsavel().getNome());
        }
    }

    // Getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }
}
