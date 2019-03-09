package Atividade4;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {

        }
    }

    public static void merge(int x[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(x, inicio, meio);
            merge(x, meio + 1, fim);
            intercala(x, inicio, fim, meio);
        }
    }

    public static void intercala(int x[], int inicio, int fim, int meio) {
        int poslivre = inicio, iniciovetor1 = inicio, iniciovetor2 = meio + 1, i;
        int aux[] = new int[5];
        while (iniciovetor1 <= meio && iniciovetor2 <= fim) {
            if (x[iniciovetor1] <= x[iniciovetor2]) {
                aux[poslivre] = x[iniciovetor1];
                iniciovetor1++;
            } else {
                aux[poslivre] = x[iniciovetor2];
                iniciovetor2++;
            }
            poslivre++;
        }
        for (i = iniciovetor1; i <= meio; i++) {
            aux[poslivre] = x[i];
            poslivre++;
        }
        for (i = iniciovetor2; i <= fim; i++) {
            aux[poslivre] = x[i];
            poslivre++;
        }
        for (i = inicio; i <= fim; i++) {
            x[i] = aux[i];
        }
    }

}
