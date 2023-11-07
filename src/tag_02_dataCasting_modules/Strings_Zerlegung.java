package tag_02_dataCasting_modules;

public class Strings_Zerlegung {
    public static void main(String[] args) {
        String test = "Hallo Welt";
        System.out.println(test.length()); // Ausgabe: 10
        String[] testArray = test.split("");
        String newString = "";
        for (String c : testArray)
        {
            System.out.println(c);
            newString += c;
        }
        System.out.println(newString);
    }
}
