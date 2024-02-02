import java.util.Scanner;
class TestNumber{
       static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int rem= num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        
        return rev;
    }
}

public class RevNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestNumber test=new TestNumber();
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        int rev = test.reverseNumber(number);
        System.out.println("Reversed Number: " + rev);

    }
}

 
