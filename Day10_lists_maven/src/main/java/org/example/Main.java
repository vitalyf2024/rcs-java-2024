import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double result = task2();
        System.out.println(result);
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
    public static double task2(){
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

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        Double avg = sum/numbers.size();

        return avg;
        //System.out.println(sum + " / " + numbers.size() + " = " + avg);
    }
}