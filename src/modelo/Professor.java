package modelo;

import interfaces.Autenticavel;

@SuppressWarnings("ALL")
public class Professor extends Pessoa implements Autenticavel {
    private String registro;
    private String areaAtuacao;
    private final String senha;

    public Professor(String nome, String cpf, String email, String registro, String areaAtuacao, String senha) {
        super(nome, cpf, email);
        this.registro = registro;
        this.areaAtuacao = areaAtuacao;
        this.senha = senha;
    }

    // Getters and setters
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
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
        System.out.println("Registro: " + this.registro);
        System.out.println("Área de Atuação: " + this.areaAtuacao);
    }
}
