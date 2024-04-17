import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        hw2();
    }

    public static boolean task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet 5 skaitļus:");
        boolean a;

        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            if(number == 28){
                return true;
                }
            }
        return false;
    }

    public static void sample1(){
        int[] m = new int[6];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < m.length; i++) {
            System.out.println("Ievadiet skaitli:");
            m[i] = sc.nextInt();
        }
        for(int i = 0; i < m.length; i++) {
            System.out.println(m[i] + "");
        }
        double ab = 1.2;
    }

    public static void task2(){
        double[] m = new double[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < m.length; i++) {
            System.out.println("Ievadiet skaitli:");
            m[i] = sc.nextInt();
            sum += m[i];
        }
        double avg = sum / m.length;
        System.out.println(avg);
    }

    public static void hw1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet masīva garumu:");
        int n = sc.nextInt();
        int sum = 0;

        if (n >= 2){
            int[] mass = new int[n];
            for(int i = 0; i < mass.length; i++) {
                System.out.println("Ievadiet skaitli:");
                mass[i] = sc.nextInt();
                sum += mass[i];
            }
            int max = mass[0];
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > max) {
                    max = mass[i];
                }
            }
            System.out.println("Skaitļu summa: "+sum);
            System.out.println("Lielākais skaitlis: "+max);
        } else {
            System.out.println("Masīva garums nevar būt mazāks par 2!");
        }
    }

    public static void hw2(){
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Lielākais skaitlis: "+max);
    }
}