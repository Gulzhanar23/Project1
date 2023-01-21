public class Task8 {
    public static void main(String[] args) {
        //8)Write a Java Program to print the first 10 numbers of Fibonacci series.
                int number1=0,
                number2=1,
                number3, i,fib=10;

        System.out.print(number1+" "+number2);

        for(i=2;i<fib;++i)
        {
            number3=number1+number2;
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }

 }
}

