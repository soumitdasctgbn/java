import java.util.*;
class Main
{
     public static void main(String args[])
    {     
          
          try
          {  
            System.out.println("Make your order: ");
            Scanner input = new Scanner(System.in);
            String s = input.next();
            new MenuException().validate(s);
              
          }
          catch(Exception ex)
          {
            System.out.println(ex);
          }

         

            
              
      }

}
class MenuException
{  
      
        static void validate(String item)throws InvalidMenuException
        {  
            boolean flag=false;
            String[] menu = {"Pizza","Burger","Sandwich"};
            
            /// Run a Linear-Search on "menu"
            for(String i:menu)
            {   
                System.out.println(i);
                if(i.equals(item)) 
                {
                    flag= true;
                    break;
                }
            }
            if(flag==false)
            {

                throw new InvalidMenuException(item +" is not available in the menu."); 
            }  
             
            else  
            {
                
                System.out.println(item +" is accepted.");
            }
              
        }  
         
        
}  

class InvalidMenuException extends Exception
{  
    InvalidMenuException(String s)
    {  
        super(s);  
    }  
}


