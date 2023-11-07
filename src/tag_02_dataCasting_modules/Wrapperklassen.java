package tag_02_dataCasting_modules;

public class Wrapperklassen {
    public static void main(String[] args) {
        int zahl = 500;
        Integer zahlInteger = new Integer(zahl);
        System.out.println("\n" + zahlInteger); // Ausgabe: 500
        System.out.println("\n" + zahlInteger.getClass());  // Ausgabe: class java.lang.Integer
        System.out.println("\n" + zahlInteger.getClass().getSuperclass()); // Ausgabe: class java.lang.Number


        int zahld = 500;
        Double zahlDouble = new Double(zahld);
        System.out.println("\n" + zahlDouble);  // Ausgabe: 500.0
        System.out.println("\n" + zahlDouble.getClass());   // Ausgabe: class java.lang.Double
        System.out.println("\n" + zahlDouble.getClass().getSuperclass());   // Ausgabe: class java.lang.Number


        float zahlf = 500;
        Float zahlFloat = new Float(zahl);
        System.out.println("\n" + zahlFloat);  //Ausgabe: 500.0
        System.out.println("\n" + zahlFloat.getClass());    //Ausgabe: class java.lang.Float
        System.out.println("\n" + zahlFloat.getClass().getSuperclass());    // Ausgabe: class java.lang.Number


        String zahl1 = "501";
        String zahlString = new String(zahl1);
        System.out.println("\n" + zahlString);  //Ausgabe: 501
        System.out.println("\n" + zahlString.getClass());   //Ausgabe: class java.lang.String
        System.out.println("\n" + zahlString.getClass().getSuperclass());   // Ausgabe: class java.lang.Object

        Boolean bool1 = new Boolean("true");
        System.out.println("\n" + bool1);   //Ausgabe: true
        System.out.println("\n" + bool1.getClass());    //Ausgabe: class java.lang.Boolean
        System.out.println("\n" + bool1.getClass().getSuperclass());    // Ausgabe: class java.lang.Object




    }
}
