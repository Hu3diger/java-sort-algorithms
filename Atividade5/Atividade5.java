package Atividade5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int[] numbers = new int[1000];

        for (int i = 0; i < 1000; i++) {
            int num = generator.nextInt();
            numbers[i] = num;
            System.out.println(num);
        }

        quicksort(numbers, 0, (numbers.length - 1));
        System.out.println("======================================");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void quicksort(int vet[], int first, int last) {
        int middle;

        if (first < last) {
            middle = partition(vet, first, last);
            quicksort(vet, first, middle);
            quicksort(vet, middle + 1, last);
        }
    }

    public static int partition(int vet[], int first, int last) {
        int pivot, top, i;
        pivot = vet[first];
        top = first;

        for (i = first + 1; i <= last; i++) {
            if (vet[i] < pivot) {
                vet[top] = vet[i];
                vet[i] = vet[top + 1];
                top++;
            }
        }
        vet[top] = pivot;
        return top;
    }

}
