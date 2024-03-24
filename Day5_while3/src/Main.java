import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task0(){
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")) {
            System.out.println("Ievadiet vardu!");
            input = sc.nextLine();
        }
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        java.lang.String a = "";
        int sum = 0;

        while(!a.equals("exit")) {
            System.out.println("Ievadiet skaitli: ");
            int number = sc.nextLine();
            sum = sum + number;
            System.out.println("Beigt ievadi?");
            a = sc.nextLine();
        }
        System.out.println("Skaitļu summa ir " + sum);
    }
}