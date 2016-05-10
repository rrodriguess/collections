package br.com.alura;

/**
 * Created by renato on 09/05/16.
 */
public class Aluno {

    private String nome;

    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null)
            throw new NullPointerException("Nome não pode ser null");

        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;

        return this.nome.equals(outro.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }
}
