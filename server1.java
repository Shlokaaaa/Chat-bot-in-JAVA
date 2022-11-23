// import java.net.*;
// import java.io.*;
// import java.util.*;

//  class cls {
//     cls() throws IOException, InterruptedException {
//         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//     }
// }

// public class server1{
//     Scanner cin= new Scanner(System.in);
//     private Socket socket=null;
//    private ServerSocket server=null;
//   private DataInputStream in =null;
//   private DataOutputStream out=null;
//   private DataInputStream input =null;
//  public server1(int port) throws IOException, InterruptedException{
//     try{
//         server=new ServerSocket(port);
//        // System.out.println("Server Started");
//        cls clear = new cls();
//         System.out.println("Enter your friend's name :");
//         String name = cin.nextLine();
        

//         System.out.println("Waiting for "+name);
//         System.out.println("");

//         socket=server.accept();
//       //  System.out.println("Client accepted.");

//         in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
//         out= new DataOutputStream(socket.getOutputStream());
//         input= new DataInputStream(System.in);
       
         
//         String line="";
//         String send="";
//         while(!line.equals("over") || !send.equals("over")){
//             line=in.readUTF();
//           System.out.println(" "+name+"-->");
//             System.out.println(line);

//             System.out.println("                                                                                   <--You");  
//           System.out.print("                                                                                  ");
//           send=input.readLine();
//           out.writeUTF(send);
//         }
//         System.out.println("Closing connection...");
//         socket.close();
//         in.close();
//     }
//     catch(IOException i){
//         System.out.println(i);
//     }
//  }

// public static void main(String args[]) throws IOException, InterruptedException{
//     server1 server=new server1(8085);

//  }

// }
import java.net.*;
import java.io.*;
import java.util.*;

 class cls {
    cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

public class server1 extends colour{
    Scanner cin= new Scanner(System.in);
    private Socket socket=null;
   private ServerSocket server=null;
  private DataInputStream in =null;
  private DataOutputStream out=null;
  private DataInputStream input =null;
 public server1(int port) throws IOException, InterruptedException{
    try{
        server=new ServerSocket(port);
       // System.out.println("Server Started");
       cls clear = new cls();
        System.out.println(PURPLE+"Enter your friend's name :"+RESET);
        String name = cin.nextLine();
        

        System.out.println(YELLOW+"Waiting for "+BLUE+name);
        System.out.println("");

        socket=server.accept();
      //  System.out.println("Client accepted.");

        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        out= new DataOutputStream(socket.getOutputStream());
        input= new DataInputStream(System.in);
       
         
        String line="";
        String send="";
        while(!line.equals("over") || !send.equals("over")){
            line=in.readUTF();
          System.out.println(" "+GREEN+name+YELLOW+"-->"+RESET);
            System.out.println(line);

            System.out.println("                                                                                  "+YELLOW+" <--"+BLUE+ "You"+RESET);  
          System.out.print("                                                                                  ");
          send=input.readLine();
          out.writeUTF(send);
        }
        System.out.println("Closing connection...");
        socket.close();
        in.close();
    }
    catch(IOException i){
        System.out.println(i);
    }
 }

public static void main(String args[]) throws IOException, InterruptedException{
    server1 server=new server1(8085);

 }

}