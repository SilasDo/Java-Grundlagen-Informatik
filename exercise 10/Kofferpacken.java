import java.util.*;
class Kofferpacken{
    public static void main(String[] args)
    {       
        boolean gamestate = true;
        String[] Kofferinhalt = new String[Integer.parseInt(args[0])];
        int Anzahl = 1;
        int Spieler =2;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Spieler 1, welcher Gegenstand soll als erstes in den Koffer?");
        Kofferinhalt[0]= myScanner.nextLine();

        gameloop:
        while(gamestate){
            for(int i=0;i<Anzahl;i++){
                System.out.println("Spieler "+Spieler+", nenne mir den "+(i+1)+". Gegenstand im Koffer");
                if (!Kofferinhalt[i].equals(myScanner.nextLine())) {                    
                    System.out.println("Das war leider falsch. Spieler "+Spieler+" hat verloren\n"+Arrays.toString(Kofferinhalt));                    
                    gamestate = false;
                    break gameloop;
                }                
            }
            System.out.println("Sehr gut! Spieler "+Spieler+", welcher Gegenstand soll als nächstes in den Koffer?");
            Kofferinhalt[Anzahl]= myScanner.nextLine();
            Anzahl ++;
            if(Spieler==1){Spieler=2;}else{Spieler=1;}            
            if(Anzahl== Kofferinhalt.length){
                System.out.println("Das Spiel ist mit einem Unentschieden zu Ende");
                gamestate = false;
            }            
        }

    }
}