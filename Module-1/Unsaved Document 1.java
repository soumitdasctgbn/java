import java.util.Scanner;
public class Factorial{
public static void F()
{
    int x;
    Scanner input= new Scanner(System.in);
    x= input.nextInt();
    if(x==0){
        System.out.println(x);
        return;
        }    
    F(); 
    System.out.println(x);
    
   }
public static void main(String args[]){
   F();    

   
}
}
