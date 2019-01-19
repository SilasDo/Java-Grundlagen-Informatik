import java.util.*;

class Versuch1{
    public static void main(String[] args){
        String[][] bild={{"##########","#### ####","##########"},
{" ########","##########","######## "},
{" ########","#### ####","######## "},
{" ###### ","##########"," ###### "},
{" ###### ","#### ####"," ###### "},
{" ###### "," ###### "," ###### "}};
int zahl = new Random().nextInt(6);
System.out.println("+----------+");
        for(int i=0;i<bild[0].length;i++){
            System.out.println("|"+bild[zahl][i]+"|");
            if(i<bild[0].length-1){
                System.out.println("|##########|");
            }
        }
        System.out.println("+----------+");
    }
}