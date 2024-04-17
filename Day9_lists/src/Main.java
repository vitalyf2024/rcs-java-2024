import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 11, 111, 1111};
        task2(a);
    }

    public static void task1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"");
        }
    }
    public static void task2(int[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int number = sc.nextInt();
        boolean b = false;

        for (int i = 0; i < a.length; i++) {
            if (number == a[i]) {
                System.out.println("Skaitļa indeks: "+ (i+1));
                b = true;
            }
        }

        if (b == false) {
            System.out.println("Skaitlis "+number+" nav atrasts!");
        }
    }
}