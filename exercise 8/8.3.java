class BMI{
    public static void main(String[] args) {
        double ant = berechneBMI(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.print("Ihr BMI ist: "+ant);
    }
    public static double berechneBMI(int groesse,int gewicht){
        return gewicht/(Math.pow((groesse*0.01),2));
    }
}