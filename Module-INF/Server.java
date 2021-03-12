import java.net.*;  
import java.io.*;  

class SERVER
{  
    public static void main(String args[])throws Exception{  
        ServerSocket server_socket=new ServerSocket(6666);  
        Socket socket=server_socket.accept();  
        
        DataInputStream in=new DataInputStream(socket.getInputStream());  
        DataOutputStream out=new DataOutputStream(socket.getOutputStream());  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
        String str1="",str2="";  
        while(!str1.equals("stop"))
        {  
            str1=in.readUTF();  
            System.out.println("client says: "+str1);  
            str2=br.readLine();  
            out.writeUTF(str2);  
            out.flush();  
        }  
        in.close();  
        socket.close();  
        server_socket.close();  
    }
}
