package Atividade6;

import java.util.Random;

public class Atividade6 {

    public static void main(String[] args) {
        String[] vetor = new String[100];

        vetor = criaVetor();
        System.out.println("/////////Desordenado//////////");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        ordena(vetor);
        System.out.println("/////////Ordenado//////////");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }


    public static String[] criaVetor() {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        int t = alfabeto.length();
        String letra1, letra2;
        Random random = new Random();
        String[] vetor = new String[100];
        for (int i = 0; i < vetor.length; i++) {
            letra1 = Character.toString(alfabeto.charAt(random.nextInt(t)));
            letra2 = Character.toString(alfabeto.charAt(random.nextInt(t)));
            vetor[i] = letra1 + letra2;
        }
        return vetor;
    }

    private static void ordena(String[] vetor) {
        int j;
        boolean flag = true;
        String aux;

        while (flag) {
            flag = false;
            for (j = 0; j < vetor.length - 1; j++) {
                if (vetor[j].compareToIgnoreCase(vetor[j + 1]) > 0) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    flag = true;
                }
            }
        }


    }
}

