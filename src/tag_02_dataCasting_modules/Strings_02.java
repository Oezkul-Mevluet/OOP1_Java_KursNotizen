package tag_02_dataCasting_modules;

public class Strings_02 {
    public static void main(String[] args) {
        int i = 10;
        String test  = "";
        // test = "" + i;
        // System.out.println(test);

        test = Integer.toString(i);
        System.out.println(test);

        //Substring
        String test1 = "Dies ist ein test";
        String test2 = test1.substring(6); //st ein test
        System.out.println(test2);
        String test3  = test1.substring(2,9); //es ist
        System.out.println(test3);

        //valueOf()
        String test5 = "";
        test5 = String.valueOf('x');
        System.out.println(test5);
        test5 = String.valueOf("42");
        System.out.println(test5);
    }
}
