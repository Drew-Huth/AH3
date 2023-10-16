import java.util.Scanner;

public class Recursive_FizzBuzz {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number to go to in FizzBuzz: ");
        num = sc.nextInt();
        System.out.println(recursiveFizzBuzz(num));

        sc.close();
    }
    public static String recursiveFizzBuzz(int n){
        boolean mod3 = ((n%3) == 0);
        boolean mod5 = ((n%5) == 0);
        if(n == 1){
            return n + " ";
        } 
        if (mod3 && mod5){
                return recursiveFizzBuzz(n-1) + "FizzBuzz ";
        }
        else if (mod3){
            return recursiveFizzBuzz(n-1) + "Fizz ";
        }
        else if (mod5){
            return recursiveFizzBuzz(n-1) +"Buzz ";
        }
        else {
            return recursiveFizzBuzz(n-1) + n + " ";
        }
    }
}  


// if (mod3 && mod5){
//                 System.out.print("FizzBuzz ");
//             }
//             else if (mod3){
//                 System.out.print("Fizz ");
//             }
//             else if (mod5){
//                 System.out.print("Buzz ");
//             }
//             else {
//                 System.out.print(from + " ");
//             }
//             fizzBuzz(++from, to, out);
