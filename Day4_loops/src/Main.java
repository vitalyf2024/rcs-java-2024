import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
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
}