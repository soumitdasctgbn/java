import java.util.*;
class MAIN
{
    private static void display(BasicInfo b) 
    {
     /// Dynamic binding
     ///runtime binding   
     b.show();  
        
    }
    private static void print(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] arg)
    {
            
        Scanner input = new Scanner(System.in);

        //BasicInfo b= new BasicInfo("Soumit",21);
        //b.show();  ///Static binding
            
        print("( Employee: 1 | Student: 2 ) Option: ");
        int option;
        option = input.nextInt();
        Employee e[] = new Employee[5];
        if(option==1)
        { 
            for(int i=0;i<5;i++)  
            {
                input.nextLine(); 
                print("(format) Name Age Salary");
                String[] inputs = input.nextLine().split(" ");   
                String name =inputs[0];
                int age = Integer.parseInt(inputs[1]);
                double salary = Double.parseDouble(inputs[2]);
                e[i] = new Employee(name, age, salary);
                display(e[i]);
                ///e.show();
            }
        }
        
        else if (option == 2)
        {   input.nextLine(); 
            print("(format) Name Age roll");
            String[] inputs = input.nextLine().split(" ");   
            String name =inputs[0];
            int age = Integer.parseInt(inputs[1]);
            int roll = Integer.parseInt(inputs[2]);
            Student s = new Student(name, age, roll);
            display(s);
            ///s.show();
        }    
        
        
    }
}

class BasicInfo
{
    private String name;
    private int age;
    
    public BasicInfo() /// Default Constructor
    {
       System.out.println("BaseInfo class is called.\n");
    }
    ///parameterized Constructor 
    ///method overloading
    ///compile time polymorphism
    public BasicInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    protected String getName()
    {
        return this.name;
    }
    
    protected int getAge()
    {
        return this.age;
    }

    public void show()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}

class Employee extends BasicInfo
{
    private double salary;
    public Employee(String name, int age, double salary)
    {
        super(name,age); 
        this.salary = salary;   
    }

    protected double getSalary()
    {
        return this.salary;    
    }
    
    ///method over-riding
    ///runtime polymorphism
    public void show()
    {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(this.salary);
    }   
}

class Student extends BasicInfo
{
    private int roll;
    public Student(String name, int age, int roll)
    {
        super(name,age); 
        this.roll = roll;   
    }
    public int getRoll()
    {
        return this.roll;    
    }
    ///method over-riding
    ///runtime polymorphism
    public void show()
    {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(this.roll);
    }   
}

