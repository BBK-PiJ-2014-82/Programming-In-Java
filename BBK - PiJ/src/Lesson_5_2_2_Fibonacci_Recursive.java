import java.util.Scanner;

public class Lesson_5_2_2_Fibonacci_Recursive {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your integer here: ");
        int yourInt = s.nextInt();
        int fibonacci;
        
        System.out.println(fibonacciRecursive(yourInt));
    }
    
    static int fibonacciRecursive(int yourInt){
        if(yourInt < 3){
            return 1;
        }
        return fibonacciRecursive(yourInt-1) + fibonacciRecursive(yourInt-2);
    }

}