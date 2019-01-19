class VowelRemover {
    public static void main(String[] args) {
    String input = "Als Gregor Samsa eines Morgens aus unruhigen Traeumen erwachte, fand er sich in seinem Bett zu einem ungeheueren Ungeziefer verwandelt";
    String output = input.replaceAll("(?i)(a|o|u|i|e)", "");
    System.out.println(output);
    }
}
    