import java.util.*;
class a74{
    public static void main(String[] args) {
        int[] myArray= new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.pow(i, 4);
        }
        for(int i:myArray){
            System.out.println(i);
        }
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }       
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1]= temp;
        System.out.println(" ");
        for(int i:myArray){
            System.out.println(i);
        }
    }
}