import java.util.*;
public class reverse
{
    public static void main(String args[])
    {  

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        while(n>0)
        {
           digit=n%10;
           System.out.print(digit);
           n=n/10;
           

        }
        
    }
}