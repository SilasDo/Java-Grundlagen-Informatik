class slide8arr {
    public static void main(String[] args) {
        int[][] zahlen = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 10, 11 } };

        for (int i = 0; i < zahlen.length; i++) {
            for (int j = 0; j < zahlen[0].length; j++) {
                System.out.println(zahlen[i][j]);
            }
        }
    }
}