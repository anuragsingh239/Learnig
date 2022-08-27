import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,rev = 0,rem,temp;
        System.out.print("Enter a number :");
        num= sc.nextInt();
        temp=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
    }
}
