import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//1)Using Scanner create an array of integer values.
// After the array is created, calculate the sum of all stored elements in that array.
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 7 numbers");
        int [] numbers=new int[7];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= scanner.nextInt();
            total+= numbers.length;

        }

        System.out.println(total);

    }
}
