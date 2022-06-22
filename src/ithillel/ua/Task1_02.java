package ithillel.ua;

public class Cquare2 {

    public static void main(String[] args) {

        int x = 2;
        int perimeter = x + x + x + x;
        int square = x * x;
        boolean ratio = perimeter == square;
        String string = "The perimeter is equal to the area :";

        System.out.println(string + ratio);  
    }    
}
