import java.util.*;
class Recursion
{
    static void fun()
    {
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        if(n==0)
            return;
        fun();
        System.out.println(n);
    }
    static int fibo(int n)
    {
        if(n==1 || n==0)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
    static int gcd(int a, int b)
    {
      if(b>a)
      {
        int temp=a;
        a=b;
        b=temp;
      }   
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }
    public static void main(String[] args)
    {
        //fun();
        //System.out.println(fibo(3));
        //System.out.println(gcd(72,60));
        
    }
}
