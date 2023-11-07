package tag_02_dataCasting_modules;

public class StringsVergleichen {
    public static void main(String[] args) {
        //Strings vergleichen per equals() und equalsIgnoreCase()
        String s = "test";
        System.out.println(s.equals("test")); // Ausgabe: true
        System.out.println(s.equals("TEST")); // Ausgabe: false
        System.out.println(s.equalsIgnoreCase("TEST")); // Ausgabe: true

        //Zeichen ersetzen / entfernen per replace() oder trim()
        String s2 = "   121  ";
        System.out.println(s2.replace('2', '8')); // Ausgabe: 181
        System.out.println(s2.trim()); // Ausgabe: 121


    }
}
