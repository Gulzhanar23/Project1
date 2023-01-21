import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//2)Using Scanner create an array of countries. When an array is created, retrieve all values
// from it and while retrieving those values print capital for each country. (use 2 different loops).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 3 countries");
        String [] country = {"Kazakhstan", "USA", "France"};
        String [] capital = {"Astana", "Washington", "Paris"};


        for (int i = 0; i < country.length; i++) {
            country [i] = scanner.nextLine();

            System.out.println(Arrays.toString(capital));

        }

    }
}
