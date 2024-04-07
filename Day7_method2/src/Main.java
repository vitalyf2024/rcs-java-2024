import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean result = hw();
        System.out.println(result);
    }

    public static int sample1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int a = sc.nextInt();

        System.out.println("Ievadiet skaitli: ");
        int b = sc.nextInt();

        return a + b;
    }

    public static int task1(){
        Scanner sc = new Scanner(System.in);
        int a = -1;

        while (a < 0){
            System.out.println("Ievadiet skaitli: ");
            a = sc.nextInt();
        }
        return a;
    }

    public static Boolean hw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet vārdu: ");
        String a = String.valueOf(sc.nextLine());

        return a.contains("aaa");
        }
}