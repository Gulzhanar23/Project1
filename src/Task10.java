public class Task10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second largest number in the array?

        int[][] myArr = {{11, 22, 33, 98, 342},
                       {24, 56, 86, 45, 123},
                       {54, 66, 41, 32, 865}};

        int largest=myArr[0][0];
        int secondLargest=myArr[0][0];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {


                if (myArr[i][j]>largest){
                    secondLargest=largest;
                    largest=myArr[i][j];
                } else if (myArr[i][j]>secondLargest) {
                    secondLargest=myArr[i][j];

                }

            }
                }
        System.out.println(+largest+ " is the largest number" );
        System.out.println(+secondLargest+ " is the second largest number");
            }}
