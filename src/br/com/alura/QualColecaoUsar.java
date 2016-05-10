package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by renato on 10/05/16.
 */
public class QualColecaoUsar {

    public static void main(String[] args) {
        Collection<Aluno> alunos = new HashSet<>();

        alunos.add(new Aluno("Terra", 3524));

        alunos.size();

    }
}
