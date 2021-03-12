import java.util.*;
class ARRAY
{

    
    public static void main(String[] arg)
    {
        ///One dimensional array
        int[] numbers = {10,20,30,40};
        for(int i =0;i<numbers.length;i++)
        {
            System.out.printf("%d ",numbers[i]);
        }
        System.out.println("\n");
        

        ///two dimensional array
        int[][] numbers1 = {{10,20,30},{100,200,300,400},{1000,2000,3000},{1,2,3}};
        
        for(int i =0;i<numbers1.length;i++)
        {
            for(int j=0;j<numbers1[i].length;j++)
            {
                System.out.printf("%d ",numbers1[i][j]);
            }
            System.out.println("");
            
        }
        System.out.println("\n");

        double[] doubles = new double[3];

        Scanner input = new Scanner(System.in);

        for(int i=0;i<doubles.length;i++)        
        {
            doubles[i]=input.nextDouble();
        }

        for(double d:doubles)
        {   
            System.out.printf("%f ",d);   
        }
         System.out.println("\n");


        int[][] numbers2 = {{10,20,30},{100,200,300},{1000,2000,3000}};
        for(int[] arr: numbers2)
        {
            for(int element: arr)
            {
                System.out.printf("%d ",element);
            }
            System.out.println("");
            
        }
        System.out.println("\n");
         
    }
}
