package Atividade4;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String vetor[] =  new String[20];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º palavra: ");
            vetor[i] = in.next();
        }

        ordena(vetor, 0, vetor.length-1);


    }

    public static void ordena(String vetor[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            ordena(vetor, inicio, meio);
            ordena(vetor, meio + 1, fim);
            combina(vetor, inicio, fim, meio);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int imp = 1;

        System.out.println(" ");
        System.out.println("Palavras que iniciam com vogais: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].toUpperCase().charAt(0) == 'A' || vetor[i].toUpperCase().charAt(0) == 'E' || vetor[i].toUpperCase().charAt(0) == 'I' || vetor[i].toUpperCase().charAt(0) == 'O' || vetor[i].toUpperCase().charAt(0) == 'U') {
                System.out.println(imp + "º palavra: " + vetor[i]);
                imp++;
            }
        }
    }

    public static void combina(String vetor[], int inicio, int fim, int meio) {
        int posLivre = inicio, vetor1 = inicio, vetor2 = meio + 1;
        String aux[] = new String[20];
        while (vetor1 <= meio && vetor2 <= fim) {
            if (vetor[vetor1].compareTo(vetor[vetor2]) <= 0) {
                aux[posLivre] = vetor[vetor1];
                vetor1++;
            } else {
                aux[posLivre] = vetor[vetor2];
                vetor2++;
            }
            posLivre++;
        }

        for (int i = vetor1; i <= meio; i++) {
            aux[posLivre] = vetor[i];
            posLivre++;
        }

        for (int i = vetor2; i <= fim; i++) {
            aux[posLivre] = vetor[i];
            posLivre++;
        }

        for (int i = inicio; i <= fim; i++) {
            vetor[i] = aux[i];
        }
    }
}
