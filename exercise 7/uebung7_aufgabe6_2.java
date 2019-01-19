import java.util.Locale;
import java.util.Scanner;

public class uebung7_aufgabe6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] input =
                                   {{75},
                                 {95, 64},
                               {17, 47, 82},
                             {18, 35, 87, 10},
                           {20, 04, 82, 47, 65},
                         {19, 01, 23, 75, 03, 34},
                       {88, 02, 77, 73, 07, 63, 67},
                     {99, 65, 04, 28, 06, 16, 70, 92},
                   {41, 41, 26, 56, 83, 40, 80, 70, 33},
                 {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
               {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
             {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
           {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
          {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
         {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23}
        };
        for (int i = input.length - 2; i >= 0; i--) {
            PrintPyramide(input);
            scan.nextLine();
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] += Math.max(input[i + 1][j], input[i + 1][j + 1]);
            }
        }
        PrintPyramide(input);
        System.out.println("\n\nSumme:" + input[0][0]);
        scan.close();
    }

    public static void PrintPyramide(int[][] input) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < input.length; i++) {
            System.out.print("   ".repeat(input.length - i));
            for (int j = 0; j < input[i].length; j++) {
                System.out.format(Locale.GERMAN, " %04d ", input[i][j]);
            }
            System.out.print("\n");
        }
    }
}