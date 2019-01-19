class a75{
    public static void main(String[] args) {
        int[][] myArray = new int[5][4];
        int k=1;
        for (int i = 0; i < myArray.length; i++) {
            for(int j=0 ; j<myArray[i].length;j++)
            {
                System.out.print(k+" ");
                myArray[i][j]=k;
                k++;
            }
            System.out.print("\n");
        }
    }
}