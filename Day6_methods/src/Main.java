import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task2(4);
        task0504(4);
    }

    public static void task1(String a, String b, String c) {
        String result = a + b + c;
        System.out.println(result);
    }

    public static void task2(int count) {
        Scanner sc = new Scanner(System.in);

        if (count > 0) {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                System.out.println("Ievadiet skaitli: ");

                int number = sc.nextInt();

                if (number % 2 == 0) {
                    sum += number;
                }
            }
            System.out.println("Skaitļu summa: " + sum);
        } else {
            System.out.println("ERROR: Count parameter less than 1");
        }
    }

    public static void task0504(int count){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        if (count % 2 == 0){
            for (int i = 0; i < count; i++) {
                System.out.println("Ievadiet skaitli: ");
                int number = sc.nextInt();
                sum += number;
            }
        } else {
            for (int i = 0; sum < 15; i++) {
                System.out.println("Ievadiet skaitli: ");
                int number = sc.nextInt();
                sum += number;
            }
        }
        System.out.println("Summa: "+sum);
    }
}