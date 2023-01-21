public class Task10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second largest number in the array?

        int[] arr = {11, 22, 33};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[0] > arr[1] && arr[0] > arr[2]) {
                    System.out.println("Number is the largest " + arr[0]);
                }
                if (arr[1] > arr[0] && arr[1] > arr[2]) {
                    System.out.println("Number 2 is largest " + arr[1]);
                }
                if (arr[2] > arr[0] && arr[2] > arr[1]) {
                    System.out.println("Number 3 is largest " + arr[2]);
                }
            }}}}
//it was first largest number lol