import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type your name:");
        String input = sc.nextLine();

        System.out.println("Sveiki, " + input + "!");
    }
}