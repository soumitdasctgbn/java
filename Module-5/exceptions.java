import java.util.*;
class Main
{
     public static void main(String args[])
    {       
          try
          {  
            new NameException().validate("Soumit");
              
          }
          catch(Exception ex)
          {
            System.out.println(ex);
          }

           try
          {  
            new EmailException().validate("soumit@gmail.com");
              
          }
          catch(Exception ex)
          {
            System.out.println(ex);
          }
  
          try
          {
            int dept_index=-1;  
            dept_index = new DeptException().validate("EEE");
          
            try
            {  
                new CourseException().validate(dept_index, "BE");    
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            } 
              
          }

          catch(Exception ex)
          {
            System.out.println(ex);
          } 

         

            
              
      }

}
class NameException
{  
      
        static void validate(String name)throws InvalidNameException
        {  
            String[] name_arr = name.split(" ");
            if(name_arr.length<2)  
            throw new InvalidNameException("Name must be consists of at least two words");  
            else  
            System.out.println("Name-Format is correct");  
        }  
         
        
}  

class InvalidNameException extends Exception
{  
    InvalidNameException(String s)
    {  
        super(s);  
    }  
}

class DeptException
{  
      
        static int validate(String dept)throws InvalidDeptException
        {  
            String[] dept_arr = {"CSE","EEE","ME"};
            boolean flag=false;
            int i=0;
            for(String d:dept_arr)
            {   
                if(d == dept)
                {
                    flag=true;
                    break;
                }
                i++;   
            }
            if(flag==false)
            {
                throw new InvalidDeptException("Dept. dose not exist");
            }  
               
            else
            {
                 System.out.println("Dept input is correct");
                 return i;      
            }
            
              
       }  
         
        
}  

class InvalidDeptException extends Exception
{  
    InvalidDeptException(String s)
    {  
        super(s);  
    }  
}

class EmailException
{  
      
        static void validate(String email)throws InvalidEmailException
        {  
            boolean flag=true;
            int at=-1,dot=-1,i=0;
            int len=email.length();
            char c;
            for(i=0;i<len;i++)
            {   
                c=email.charAt(i);

                if((c>='a' && c<='z') || c=='_' || (c>='0' && c<='9'))
                {
                   flag=flag;
                }
                else if(c == '@')
                {
                    if(at!=-1 || i==0)
                    {
                        flag=false;
                        break;

                    }
                    else
                    {
                        at=i;
                    }
                }
                
                else if(c == '.')
                {
                    if(dot!=-1 || i==0)
                    {
                        flag=false;
                        break;
                        
                    }
                    else
                    {
                        dot=i;
                    }
                }
                else
                {
                    flag=false;
                    break;
                }
                   
            }
            i--;
        
            if((at==-1 || dot==-1) || (dot-at)<=0)
            {
                flag=false;
            }
            if(flag==false)  
              throw new InvalidEmailException("Email is not in acceptable format.");  
            else  
              System.out.println("Email is in acceptable format.");  
       }  
         
        
}  

class InvalidEmailException extends Exception
{  
    InvalidEmailException(String s)
    {  
        super(s);  
    }  
}


class CourseException
{  
      
        static void validate(int dept_index,String course)throws InvalidCourseException
        {  
            boolean flag=false; 
            String[][] course_list = {{"SOP","OOP","DM","DS"},{"SOP","BE","DE"},{"SOP","MD","MECHA"}};
            for(String c: course_list[dept_index])
            {
                if(c== course)
                {
                    flag=true;
                }
            }
            
            if(flag==false)  
                throw new InvalidCourseException("Invalid Course");  
            else  
                System.out.println("Valid course");  

        } 
         
        
}  

class InvalidCourseException extends Exception
{  
    InvalidCourseException(String s)
    {  
        super(s);  
    }  
}
