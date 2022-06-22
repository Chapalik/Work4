package ithillel.ua;

public class Square {

    public static void main(String[] args) {

        int x = 4;
        int perimeter = x + x + x + x;
        int square = x * x;
        boolean ratio = perimeter == square;
        String string = "The perimeter is equal to the area :";

        System.out.println(string + ratio);
    }
}
