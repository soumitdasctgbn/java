import java.util.*;
import java.io.*; 
public class Main
{
    public static void main(String[] args) 
    {
    
        // Create tasks
        Runnable task1 = new Task1(1000000);
        Runnable task2 = new Task2(1000000);

        // Create threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start threads
        thread1.start();
        thread2.start();

    }
}

// The task for printing a character. 
class Task1 implements Runnable 
{

    private int times;
    public Task1(int times)
    {
        this.times = times;
    }
    @Override 
    /** Override the run() method to tell the system
    * what task to perform
    */
    public void run() 
    {
          
        for (int i = 0; i <this.times; i++)  
        {
            
            try {
                System.out.println("Task1 is running..");
                Thread.sleep(1000);
                }
            catch (InterruptedException ex)
                {
                ex.printStackTrace();
                }
        }
   
    }
}

// The task class for printing numbers 
class Task2 implements Runnable 
{
    private int times;
    public Task2(int times)
    {
        this.times = times;
    }
    @Override 
    /** Tell the thread how to run */
    public void run() 
    {
        
       for (int i = 0; i <this.times; i++)  
        {
             try {
                System.out.println("                       Task2 is running..");
                Thread.sleep(1000);
                }
            catch (InterruptedException ex)
                {
                ex.printStackTrace();
                }
        }
        
    }
}
