import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
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
}