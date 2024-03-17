import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hw_2();
    }

    public static void task1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet simbolu virkni:");

        String input = sc.nextLine();

        int input_len = input.length();

        if(input.equals("programmesana")) {
            System.out.println("Uzvarēji!");
        } else if(input_len == 13){
            System.out.println("vienāds simbolu skaits");
        } else {
            System.out.println("Zaudēji");
        }
    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet ciparu:");

        int input2 = sc.nextInt();

        if((input2 >= 10) || (input2 <= 5)){
            System.out.println("$$");
        } else {
            System.out.println("$");
        }
    }

    public static void hw_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet ciparu:");

        int number = sc.nextInt();

        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println("Hello World!");
            }
        } else {
            System.out.println("Ievadiet skaitli, kas ir lielāks nekā 0!");
        }
    }

    public static void hw_2() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ievadiet skaitli:");
            int numb = sc.nextInt();
            sum = sum + numb;
        }
        System.out.println("Jūsu skaitļu summa ir " + sum);
    }
}