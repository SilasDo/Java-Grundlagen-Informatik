/*
Schreiben Sie ein Programm, welches einen beliebigen String mit Hilfe einer for Schleife
rückwärts auf der Konsole ausgibt.
*/
import java.util.*;
class a65{
    //reverse string
    public static void main(String[] args) {
        System.out.println("String eingeben");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        String output ="";
        for (int i = input.length()-1; i>-1; i--) {
            output += input.substring(i,i+1);
    
        }
        System.out.println(output);
    }
}