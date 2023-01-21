public class Task5 {
    public static void main(String[] args) {
        //5)Create a 2D array of integers. Develop a program which will calculate
        // the sum of  even and odd numbers for that array.

        int[][] arr = {{20, 21, 22},
                {23, 24, 25},
                {26, 27, 28}};

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0)
                    sumEven += arr[i][j];
            else if (arr[i][j] % 2 != 0)
                    sumOdd += arr[i][j];

                }
            }
            System.out.println("The sum of the even numbers is " + sumEven);
            System.out.println("The sum of the odd numbers is " + sumOdd);


        }
    }
