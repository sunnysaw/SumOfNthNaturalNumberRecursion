/*
Question : Given a number n. Find the sum of natural numbers till n but with
          alternate signs.
 ______________________________________________________________________________
 Constraints : 0<=n<=1e6
 I/O : N = 10 => 1-2+3-4+5-6+7-8+9-10
 O/P : = -5

 I/O : N = 5
 O/P : 3
 */
import java.util.Scanner;
public class Main {
    static int SumOfNaturalNumber(int number){
        if (number == 0)return 0;
        if (number % 2 == 0) {
            return SumOfNaturalNumber(number - 1) - number;
        }
        else
            return SumOfNaturalNumber(number - 1) + number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,EvenNumber = 0,OddNumber = 0,starting,stroge,TemporaryStroge;
        System.out.println("Enter the number :");
        number = sc.nextInt();
        System.out.println("Printing the number without using recursion :");
        for (starting = 1; starting <= number; starting++){
            TemporaryStroge = starting;
            if (TemporaryStroge % 2 == 0){
                EvenNumber -= starting;
            }else
                OddNumber += starting;
        }
        stroge = OddNumber + EvenNumber;
        System.out.println("Printing the result : " +stroge);
        System.out.println("Printing the result with help of recursion :");
        System.out.println(SumOfNaturalNumber(number));
    }
}