public class Task10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second largest number in the array?

        int[][] arr = {{11, 22, 33, 98, 342},
                       {24, 56, 86, 45, 123},
                       {54, 66, 41, 32, 865}};

        int largest=arr[0][0];
        int secondLargest=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>largest){
                    secondLargest=largest;
                    largest=arr[i][j];
                } else if (arr[i][j]>secondLargest) {
                    secondLargest=arr[i][j];

                }

            }
                }
        System.out.println("The largest number is " +largest);
        System.out.println("The second largest number is " +secondLargest);
            }}
