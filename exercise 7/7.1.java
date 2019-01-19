//quellenverfahren base10 -> base 2
import java.util.*;
class a71{
public static List<Integer> dual = new ArrayList<Integer>();
    public static void main(String[] args){
        int dezi = 3425;
        quell(dezi);
        String antw="";
        for (int i = dual.size()-1; i>=0; i--) {
            antw += dual.get(i).toString();
        }
        System.out.println(dezi+" Dezimal ist "+antw+" Dual");
    }

    public static void quell(int start){
        if(start != 0){
            dual.add(start%2);
            quell(start/2);
        }
    }
}