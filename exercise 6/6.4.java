/* 
Schreiben Sie ein Programm, welches vom Benutzer über einen Kommandozeilenparameter
das Alter erfragt. Speichern Sie das Alter in einer int-Variable und benutzen Sie
eine if -Anweisung um dem Benutzer einer der folgenden Nachrichten auf der Konsole
anzuzeigen:

*/
import java.util.*;
class a64{
    public static void main(String[] args) {
        int alter1 = Integer.parseInt(args[0]);
        if(alter1<18){
            System.out.print("nicht volljährig");
        }
        else if(alter1>=67){
            System.out.print("Sie sind bereits im Rentenalter");
        }
        else{
            System.out.print("Vielen Dank für Ihre Daten");
        }
    }
}