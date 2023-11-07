package tag_02_dataCasting_modules;

public class Wrapper_Aufgabe {
    public static void main(String[] args) {
        int zahl = 500;
        String zahlString = "501";
        Integer zahlInteger = new Integer(zahl);
        System.out.println("\n" + zahlInteger);
        System.out.println(zahlInteger.intValue());
        Integer zahlInteger2 = new Integer(zahlString);
        System.out.println("\n" + zahlInteger2.intValue());

        String intString = "501";
        String byteString = "127";
        int zahlInt = Integer.parseInt(intString);
        System.out.println("\n" + zahlInt);

        byte zahlByte = Byte.parseByte(byteString);
        System.out.println("\n" + zahlByte);

        Boolean bool = new Boolean("True");
        System.out.println(bool);

        Short sh = new Short("1");
        System.out.println(sh);
    }
}
