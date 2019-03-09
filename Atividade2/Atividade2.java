package Atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List numbers = new ArrayList();
        
        System.out.println("Please enter only Integer numbers");
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter the " + (i + 1) + "º number: ");
            numbers.add(in.nextInt());
        }

        numbers = insertionSort(numbers);
        numbers.forEach((obj) -> {
            System.out.println(obj);
        });
        checkGreatest(numbers);
    }

    public static List<Integer> insertionSort(List<Integer> n) {
        int joker;
        for (int i = 1; i <= n.size() - 1; i++) {
            joker = n.get(i);
            int j = i - 1;
            while (j >= 0 && n.get(j) > joker) {
                n.set(j + 1, n.get(j));
                j = j - 1;
            }
            n.set(j + 1, joker);
        }
        return n;
    }

    public static void checkGreatest(List<Integer> n) {
        int greatest = n.get(0);
        int lowest = n.get(0);
        int apGreatest = 0, apLowest = 0;
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) > greatest) {
                greatest = n.get(i);
            }
            if (n.get(i) < lowest) {
                lowest = n.get(i);
            }
        }
        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) == greatest) {
                apGreatest += 1;
            }
            if (n.get(i) == lowest) {
                apLowest += 1;
            }
        }
        System.out.println("About the list: \nThe greatest number is " + greatest + " and appear " + apGreatest + " times \nThe lowest number is " + lowest + " and appear " + apLowest + " times");
    }
}
