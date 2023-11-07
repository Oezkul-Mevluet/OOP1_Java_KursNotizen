package tag_02_dataCasting_modules;

public class PreIncrement_PostIncrement {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("++a yazdigimda konsolda yazdirilan : " + ++a);  //11
        System.out.println("++a' dan 1 satir sonra konsolda a degeri: " + a);   //11


        int b = 10;
        System.out.println("b++ yazdigimda konsolda yazdirilan : " + b++);  // 10
        System.out.println("b++' dan 1 satir sonra konsolda a degeri: " + b);   // 11

        int x = 10;

        int y = x++;

        System.out.println("x: " + x + ", y : " + y);   // x: 11, y : 10


    }
}
