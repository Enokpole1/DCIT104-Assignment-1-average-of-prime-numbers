import java.util.*;
public class Program
{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ending number:");
        int num2 = sc.nextInt();

        double num1 =1.0, sum = 0.0, count =0.0;
        double avg = 0.0;

        for(int i = 1; i<=num2; i++){
            int n =i;
            int temp =0;
            int a = 2;

            while(a<=(n/2)) {

                if(n%a==0)
                {
                    temp++;
                    break;

                }
                a++;
            }
            if (temp ==0 && i != 1){
                sum = sum + i;
                count++;
            }
        }
        System.out.println("the number of prime numbers are: "+ count);
        System.out.println("The sum of the prime numbers between 1 and the number you entered is : "+sum);
        avg = sum/count;
        System.out.println("The average of all the prime numbers is:"+ avg);
	}
}