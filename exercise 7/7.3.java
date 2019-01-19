import java.util.*;

class a73 {
    public static void main(String[] args) {
        System.out.println("Geben Sie einen Monat als Zahl über die Konsole ein (1 = Januar, 12 = Dezember)");
        Scanner myScanner = new Scanner(System.in);
        int monat = myScanner.nextInt();
        switch ((monat - 1) / 3) {
        case 0:
        System.out.print("Q1");
            break;
        case 1:
        System.out.print("Q2");
            break;
        case 2:
        System.out.print("Q3");
            break;
        case 3:
        System.out.print("Q4");
            break;
        default:
            break;
        }
    }
}