package modelo;

import java.util.ArrayList;
import java.util.List;

    public class Curso {
        private String codigo;
        private String nome;
        private final List<Disciplina> disciplinas;


    public Curso(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    public void removerDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public void listarDisciplinas() {
        System.out.println("\nDisciplinas do Curso " + this.nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println(d.getCodigo() + " - " + d.getNome() +
                    "\nProf. Responsável: " + d.getProfessorResponsavel().getNome());

        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}