import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

import org.bridj.relocated.org.objectweb.asm.Label;
public class client {

    client() throws Exception {
        Socket socket = new Socket("192.168.43.19", 8080);
        System.out.println("Getting ready...");
        OutputStream outputStream = socket.getOutputStream();//C:\Users\KUSH SONI\Desktop\Semester 3\OOP\Innovativve\Image Transmissiona\trial2\Client\kush.jpg

        BufferedImage image = ImageIO.read(new File("C:\\Users\\Samir\\Desktop\\final oop\\test.png"));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", byteArrayOutputStream);

        byte[] size = ByteBuffer.allocate(4).putInt(byteArrayOutputStream.size()).array();
        outputStream.write(size);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.flush();
        System.out.println("Flushed: " + System.currentTimeMillis());

        Thread.sleep(2000);
        System.out.println("Closing: " + System.currentTimeMillis());
        socket.close();
        
      
    }
   
}
