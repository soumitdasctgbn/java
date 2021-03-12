class Hello{
    private static void saywelcome(String s)
    {
        System.out.println("Hello "+s+"!");
    }
    public static void main(String[] arg)
    {
       
        for(String s: arg)
        {
         saywelcome(s);
     
        }
  
    }
}
