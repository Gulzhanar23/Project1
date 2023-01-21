public class Task4 {
    public static void main(String[] args) {
//4) Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.

        int [] [] arr = {{20,21,22},
                      {23,24, 25},
                      {26,27,28}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(+arr[i] [j]);

                }
            }
            System.out.println();
        }
    }
}
//if (arr[i] % 2 != 0) {
//                arr[i] = 0;
// System.out.print(i+" ");
//                }
//            }
//            System.out.println();
//        }