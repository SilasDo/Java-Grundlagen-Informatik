import java.util.*;
class xmas{
    public static void main(String[] args) {
        List<Integer> Primzahlen = new ArrayList<Integer>();
        List<Integer> xmasPrimzahlen = new ArrayList<Integer>();
        int counter=2;
        long start = System.currentTimeMillis();
        while (xmasPrimzahlen.size()<11) {    
            boolean isPrimeNumber = true;
            for (int i = 0; i < Primzahlen.size(); i++) {
                if(counter % Primzahlen.get(i)==0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber){
                Primzahlen.add(counter);                
                if (counter >10) {
                    boolean isXmasNumber = true;
                    int b = counter;
                    int n = counter;
                    while ((int) (b*0.1)>0) {
                        b = (int) (b*0.1);    
                        n = n % (int) Math.pow(10, (int) Math.log10(n));
                        if( (Primzahlen.indexOf(b)==-1) || (Primzahlen.indexOf(n)==-1) ){
                            isXmasNumber = false;
                            break;
                        }
                        //System.out.println("\noriginal:"+counter+"\nRechts:"+b+"\nLinks:"+n);
                    }   
                    if(isXmasNumber){
                        xmasPrimzahlen.add(counter);
                    } 
                }   
            }
            counter++;
        }
        long end =System.currentTimeMillis();
        System.out.println(xmasPrimzahlen);
        System.out.println(" Zeit aufwand in ms: "+(end-start));
    }
}