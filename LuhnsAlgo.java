import java.util.*;
public class LuhnsAlgo 
{
    public static void main(String args[]) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String cardNumber = sc.nextLine();
        int sum = 0;
        for(int j=cardNumber.length()-1;j>=0;j--)
        {
            int number=Integer.parseInt(""+cardNumber.charAt(j));
            if((cardNumber.length()-1-j)%2==1){
                number=number*2;
                if(number>9){
                    number=number-9;
                }
            }
            sum=sum+number;
        }
        if(sum%10==0){
            System.out.println("Card Number is Valid!");
        }
        else{
            System.out.println("This Card is a Fake!");
        }
    }
}
