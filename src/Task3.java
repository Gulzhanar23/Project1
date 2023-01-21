public class Task3 {
    public static void main(String[] args) {

        //3) Create a 2D array of integer values. Print the sum of all numbers.
        int sum1 = 0;
        int[][] arr = {{11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum1+=arr[i][j];

            }
        }
        System.out.println("Sum="+sum1);

    }}




