package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by renato on 09/05/16.
 */
public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo :" + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
