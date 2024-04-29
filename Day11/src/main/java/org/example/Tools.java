package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tools {
    public static void main(String[] args) {
        numbers_manual();
        numbers_random();
    }

    public static List numbers_manual() {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet 10 skaitļus: ");
        for (int i = 0; i < 10; i++){
            numbers.add(sc.nextInt());
        }

        return numbers;
    }
    public static List numbers_random() {
        List<Integer> numbers = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(r.nextInt(100));
        }

        return numbers;
    }
}
