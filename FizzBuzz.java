import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number to go up to in FizzBuzz: ");
        num = sc.nextInt();
        fizzBuzz(num);


        sc.close();
    }
    public static void fizzBuzz(int n){
        for (int i = 1; i < n + 1; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            }
            else if (i % 3 == 0){
                System.out.print("Fizz ");
            }
            else if (i % 5 == 0){
                System.out.print("Buzz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
