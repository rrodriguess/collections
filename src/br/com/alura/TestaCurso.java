package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by renato on 09/05/16.
 */
public class TestaCurso {

    public static void main(String [] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

//        javaColecoes.getAulas().add(new Aula("Teste", 21)); UnmodifableList não permite add
        javaColecoes.adiciona(new Aula("Trabalhando com Listas", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getAulas());
        System.out.println(javaColecoes.toString());

    }
}
