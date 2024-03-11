import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
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
    }