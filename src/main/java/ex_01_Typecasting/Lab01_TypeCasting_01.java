package ex_01_Typecasting;

public class Lab01_TypeCasting_01 {

    public static void main (String[] args)
    {
        int a = 600;
        //byte b = a;   syntax erroe
        // we are trying to store larger values into the smaller data type it is called narrowing type casting
        // we can use explicit casting here
        byte b1 = (byte) a;
        System.out.println(b1);

    }
}
