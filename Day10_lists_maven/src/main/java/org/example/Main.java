import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        hwday9();
    }

    public static void task1(){
        List<String> students = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet vārdus (ievadiet stop, lai pabeigtu): ");
        String name = new String(" ");
        String name2 = new String("stop");

        while (!name.equals(name2)) {
            name = sc.nextLine();
            students.add(name);
            }
        int index = students.size() - 1;
        students.remove(index);
        readList(students);
    }
;
    public static void readList(List<String> students) {
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    public static List<Double> task2(){
        List<Double> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitļus (ievadiet 0, lai beigt): ");
        double sum = 0;
        Double num = 1.0;

        while (num != 0) {
            num = sc.nextDouble();
            numbers.add(num);
        }
        int index = numbers.size() - 1;
        numbers.remove(index);

        return numbers;
        //System.out.println(sum + " / " + numbers.size() + " = " + avg);
    }
    public static void hwday9() {
        List<Integer> rdmnum = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            rdmnum.add(random.nextInt(10));
            System.out.println(rdmnum.get(i));
        }

        int topsum = rdmnum.get(0) + rdmnum.get(1);
        int sum2 = 0;
        int pair1 = rdmnum.get(0);
        int pair2 = rdmnum.get(1);

        for (int i = 1; i < 9; i++) {
            sum2 = rdmnum.get(i) + rdmnum.get(i + 1);
            if (topsum < sum2) {
                topsum = sum2;
                pair1 = rdmnum.get(i);
                pair2 = rdmnum.get(i + 1);
            }
        }
        System.out.println();
        System.out.println(pair1 + ", " + pair2 + " = "+topsum);
    }
}