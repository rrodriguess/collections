package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by renato on 09/05/16.
 */
public class TestaAlunos {

    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Renato Rodrigues");
        alunos.add("Robson Silveira");
        alunos.add("Leonasa Lucas");
        alunos.add("George Lucas");
        alunos.add("Rubem Lucas");
        alunos.add("Rogerio Lucas");
        alunos.add("Robson Silveira");

        boolean renatoEstaMatriculado = alunos.contains("Renato Rodrigues");
        alunos.remove("Robson Silveira");

        System.out.println(renatoEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

    }
}
