public class Task6 {
    public static void main(String[] args) {
//6)Write a program to swap 2 numbers without a temporary variable?

            int x = 50;
            int y = 20;
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After swapping:"+ " x = " + x + ", y = " + y);
        }
    }
