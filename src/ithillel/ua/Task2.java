package ithillel.ua;

public class Task2 {

    public static void main(String[] args) {

        byte b = 127;
        short s = b;
        int i = s;
        long l = i;

        int i1 = 1000;
        double d = i1;

        short s1 = 32767;
        float f1 = s1;
        double d1 = f1;

        char c = 1;
        int i2 = Character.getNumericValue(c);

        System.out.println(i2);     
    }
}
