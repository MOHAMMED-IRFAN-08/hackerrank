import java.util.*;
public class Solution 
{
    public static void main(String[] args)
     {
         Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        if (N%2!=0)
        {
            System.out.println("Weird");
        }
        else if ((N%2==0) && (N>=2 && N<=5))
        {
            System.out.println("Not Weird");
        }
        else if ((N%2==0) && (N>=6 && N<=20))
        {
            System.out.println("Weird");
        }
        else if ((N%2==0) && (N>20))
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Nothing");
        }
  
