package br.com.alura;

/**
 * Created by renato on 10/05/16.
 */
public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com Listas", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a = new Aluno("Rodrigo Turini", 34672);
        Aluno b = new Aluno("Renato Rodrigues", 5617);
        Aluno c = new Aluno("Robert De Niro Turini", 17645);

        javaColecoes.matricula(a);
        javaColecoes.matricula(b);
        javaColecoes.matricula(c);

        System.out.println("Who is this aluno whit matricula 5617 ?");
        Aluno aluno = javaColecoes.buscaMatriculado(5618);
        System.out.println("aluno : " + aluno);
    }
}
