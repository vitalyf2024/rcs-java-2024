public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli:");
        int a = sc.nextInt();

        System.out.println("Ievadi tekstu!");
        String b = sc.nextLine();

        System.out.println(a+b);
    }
}