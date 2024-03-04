import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {

        //Scanner sc = new Scanner(System.in);

        //System.out.println("Jūsu vārds:");
//        String name = sc.nextLine();
//
//        System.out.println("Sveiki, " + name + "!");
//
//        System.out.println("Jūsu dzimšanas gads:");
//        int year = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Lietotāju sauc " + name + " un lietotājam ir " + (2024 - year) + " gadi");

        //public static void task1() {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Skaitlis 1:");
//        int number1 = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Skaitlis 2:");
//        int number2 = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Summa = " + (number1 + number2));
//        System.out.println("Starpība = " + (number1 - number2));



        //public static void task2() {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Skaitlis 1:");
//        int number1 = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Skaitlis 2:");
//        int number2 = Integer.parseInt(sc.nextLine());
//
//        if(number1+number2 >= 0){
//            System.out.println("+");
//        }else{
//            System.out.println("-");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Jūsu teksts:");

        String teksts = sc.nextLine();
        System.out.println(teksts);

        int len = teksts.length();
        //System.out.println(len);
        if (len > 5){
            System.out.println("Programmēt ir forši!");
        }else{
            System.out.println("Būs labi!");
        }
    }

    }
