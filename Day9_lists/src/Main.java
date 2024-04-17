import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 2, 9, 4, 6};
        task3(a);
    }

    public static void sample() {
        List<String> strList = new ArrayList<String>();
        System.out.println(strList.size());

        strList.add("aaaa");
        strList.add("bbbb");
        strList.add("cccc");
        strList.add("dddd");
    }

    public static void task3(int[] a){
        List<Integer> intList = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            intList.add(a[i]);
            System.out.println(intList.get(i));
        }

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