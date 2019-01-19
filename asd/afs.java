import java.util.Scanner;
class test12{

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein:");
        String str = sc.nextLine();
        System.out.print("Hallo ");
        System.out.println(str);
    }
}