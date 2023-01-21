public class Task9 {
    public static void main(String[] args) {
        //9)Maximum and minimum number in the array?

        int[][] arr = {{11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };
        int min= arr [0] [0];
        int max= arr [0] [0];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if (arr[i][j]<min)
                   min=arr[i][j];
               else if (arr[i][j]>max)
                   max=arr[i][j];
                   
               }

            }

        System.out.println("The minimum number is "+min);
        System.out.println("The maximum number is "+max);

    }
}
