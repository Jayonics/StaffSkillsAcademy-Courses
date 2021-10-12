public class module18 {
    public static void main(String[] args) {
        String phrase = "The quick brown fox jumped over the lazy dogs.";
        //Prints the number of characters in the String
        System.out.println(phrase.length());
        //Finds the index of the word fox.
        System.out.println(phrase.indexOf("fox"));
        //Replace jumped with a new word.
        System.out.println(phrase.replace("jumped", "hopped"));
        //Changes case
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
    }
}