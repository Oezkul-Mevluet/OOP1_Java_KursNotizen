package tag_02_dataCasting_modules;

public class Strings {
    public static void main(String[] args) {

        String test = "Dies ist ein test";
        System.out.println(test.charAt(7));
        char[] c = test.toCharArray();
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        char letzteZeichen = test.charAt(test.length()-1);
        System.out.println(letzteZeichen);


        String s1 = "     123             ";
        System.out.println(s1.replace('2', '7'));
        System.out.println(s1.replace("23", "87"));
        System.out.println(s1);
        System.out.println(s1.trim());
    }
}
