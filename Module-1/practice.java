import java.util.Scanner;
public class Factorial{
public static void main(String args[]){
    int fact=1;
    int n;
    Scanner input= new Scanner(System.in);
    n= input.nextInt();

    for(int i=1; i<=n; i++){
            fact= fact*i;
            System.out.println("factorial= " + fact);
        }
}
}
