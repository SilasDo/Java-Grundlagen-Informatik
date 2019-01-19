//Geben Sie alle durch 7 teilbaren Zahlen zwischen 1 und 140 aus. Lösen Sie die Aufgabe

class a66{
    public static void main(String[] args) {
        for (int i = 7; i <= 140; i+=7) {
            System.out.println(i);
        }
        int j=7;
        while (j<=140) {
            System.out.println(j);
            j+=7;
        }
        int k =0;
        do {
            k+=7;
            System.out.println(k);
        } while (k<140);
    }
}