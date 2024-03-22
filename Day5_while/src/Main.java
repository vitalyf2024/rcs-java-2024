public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void while1(){
    Scanner sc = new Scanner(System.in);
    String input = "";


    while(!input.equals("exit")) {
        System.out.println("Ievadiet vardu!");
        String input = sc.nextLine();
        }
    }
    
    public static voide task1(){
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("jā","exit")) {
            System.out.println("Ievadiet skaitli: ");
            int number = sc.nextLine();
            int sum = sum + number;

            System.out.println("Beigt ievadi?");
            input = sc.nextLine();
        }
        System.out.println("Skaitļu summa ir " + sum);
    }
}