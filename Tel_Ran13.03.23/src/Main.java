import java.util.Locale;

public class Main {
    public static void main(String[] args) {

       String strSpace = "I study Basic Java!";

       char charSpase = strSpace.charAt(18);
       System.out.println(charSpase);

        boolean helloJava = strSpace.contains("Java");
        System.out.println(helloJava);

        String strSpaceWihtO = strSpace.replace ('a','o');
        System.out.println(strSpaceWihtO);

        String strSpaceStars = strSpace.toUpperCase();
        System.out.println(strSpaceStars);

        String strSpaceGalaxy = strSpace.toLowerCase();
        System.out.println(strSpaceGalaxy);

        String strSpaceOnlyJava = strSpace.substring(14);
        System.out.println(strSpaceOnlyJava);

    }
}