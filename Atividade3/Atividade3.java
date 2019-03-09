package Atividade3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List numbers = new ArrayList();

        System.out.println("Please enter REAL numbers");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the " + (i + 1) + "º number: ");
            numbers.add(in.nextDouble());
        }

        numbers = selectionSort(numbers);
        numbers.forEach((obj) -> {
            System.out.println(obj);
        });
        checkGreatest(numbers);
    }

    public static List<Double> selectionSort(List<Double> n) {
        double joker, lowest;
        int pos;
        for (int i = 0; i <= n.size() - 2; i++) {
            joker = n.get(i);
            lowest = n.get(i + 1);
            pos = i + 1;
            for (int j = i + 2; j <= n.size() - 1; j++) {
                if (n.get(j) < lowest) {
                    lowest = n.get(j);
                    pos = j;
                }
            }
            if (lowest < joker) {
                n.set(i, n.get(pos));
                n.set(pos, joker);
            }
        }
        return n;
    }

    public static void checkGreatest(List<Double> n) {
        double greatest = n.get(0);
        double lowest = n.get(0);
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
