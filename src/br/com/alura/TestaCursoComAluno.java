package br.com.alura;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by renato on 09/05/16.
 */
public class TestaCursoComAluno {

    public static void main(String [] args) {

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

//        System.out.println("Todos os alunos matriculados: ");
//        javaColecoes.getAlunos().forEach(a2 -> {
//            System.out.println(a2.toString());
//        });

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        System.out.println("O aluno " + a + " está matriculado ?");
        System.out.println(javaColecoes.estaMatriculado(a));

        String nome = "Rodrigo Turini";
        System.out.println(javaColecoes.estaMatriculado(a));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("O a1 é == ao Turini ?");
        System.out.println(a.equals(turini));
        System.out.println(a.hashCode() == turini.hashCode());

    }
}
