import java.util.*;
class exp1{
    public static void main(String[] args) {
        List<Integer> Primzahlen = new ArrayList<Integer>();
        int counter=2;
        long start = System.currentTimeMillis();
        while (Primzahlen.size()<1002) {    
            boolean isPrimeNumber = true;
            for (int i = counter-1; i>1; i--) {
                if ( (counter % i==0)) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber){
                Primzahlen.add(counter);            
            }
            counter++;
        }
        long end =System.currentTimeMillis();
        System.out.println(Primzahlen.get(1001)+" Zeit aufwand in ms: "+(end-start));
    }
}