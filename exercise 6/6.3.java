class a63{
    public static void main(String[] args) {
        int a = 5;
        int b =3;
        int c = -11;
        double x1= (-b+Math.sqrt((b*b)-4*a*c))/(2*a*c) ;
        double x2= (-b-Math.sqrt((b*b)-4*a*c))/(2*a*c) ;
        System.out.print(x1+" "+x2);
    }
}