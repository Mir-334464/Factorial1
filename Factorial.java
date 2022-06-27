import java.util.*;

class Factorial

  {

    public static void main(String[]args)

       {

      Scanner sc=new Scanner(System.in);
 
      System.out.print("Enter Number To Print Factorial :");
 
      int N=sc.nextInt();
 
      int i=N, Fact=1;

     while(i>0)
    
     {

       Fact=Fact*i;
     
       i--;
    }
System.out.println("Factorial of Enter Number Is:" +Fact);

     }
}