package typecasting;

public class TypeCasting {


    //Type Casting: Bir numeric data type'ini diğer numeric data typ'ine cevirmek demektır.
    //          byt < short < ınt < long < float < double

    //Note: Kucuk data type' ini buyuk data type' ine cevirmeye "auto widening" denir
    //Note: Buyuk data type' ini kucuk data type' ine cevirmeye " explicit narrowing" denir

    public static void main(String[] args) {
        byte age = 23;
        int newAge = age;
        long population = 1234;
        int nevPopuation = (int) population;
        //Example 1: short'u double'a ceviren kodu yazınız

        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;//Auto Widening

        //Example 2: float'i byte yapan kodu giriniz
        float price = 12.99F;
        byte newPrice = (byte) price;//Explicit Narrowing

        System.out.println(newPrice);// ==> java ondalık sayıyı, tam sayıya cevirirken yuvarlama islemi yapmaz
        // ==> java ondalık sayıyı, tam sayıya cevirirken ondalık kısmını sıler

        int number = 515;

        byte newNumber = (byte) number;
        System.out.println(newNumber);//3 ==> java 515'i 256(byte daki sayıların sayısı )'ya doldu kalanı retrun etti
        int num = 510;
        byte newNum = (byte) num;
        System.out.println(newNum);// -2

    }
}
