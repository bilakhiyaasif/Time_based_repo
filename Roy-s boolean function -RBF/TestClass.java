/*
Roy's boolean function (RBF) is True, if number of the positive integers less than or equal to N that are relatively prime to N, is prime; else False.
In other words, let Z be the number of integers K in the range 1 ≤ K ≤ N for which the greatest common divisor gcd(N, K) = 1. If Z is prime then RBF is True else it is False.

Given an integer N, your task is to find if its RBF value.
*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int a[]=new int[t];
      for(int i=0;i<t;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int i=0;i<t;i++)
      {
      gcd(a[i]);

   }
    }
    public static void gcd(int N)
    {
     gcd1(N);
    }
    public static void gcd1(int N)
    {
      int a[]=new int[N];
      int c1=0;
    for(int i=1;i<N;i++)
     {
       if(gcd2(i,N)==1)
       {
         a[c1]=i;
         c1++;

       }
     }
      boolean f1=false;
     for(int i=2;i<=c1;i++)
    {
      if(i!=c1)
      {
     if(c1%i==0)
     {
       f1=true;
    // System.out.println(i);
       break;
     }
   }
   }
   if(f1)
   {
     System.out.println("FALSE");
   }
   else
   {
     System.out.println("TRUE");
   }



    }
    public static int gcd2(int i,int N)
    {
      if(i==0)
      {
      return N;
    }
      else
      {
        return gcd2(N%i,i);
      }

    }

}
