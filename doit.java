import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.github.sarxos.webcam.Webcam;


/**
 * Example of how to take single picture.
 * 
 * @author Bartosz Firyn (SarXos)
 */
public class doit {

	doit(int n)throws Exception {
       if (n==0) {
		
	   
		// get default webcam and open it
		Webcam webcam = Webcam.getDefault();
		webcam.open();

		// get image
		BufferedImage image = webcam.getImage();

		// save image to PNG file
		ImageIO.write(image, "PNG", new File("C:\\Users\\Samir\\Desktop\\test.png"));
		webcam.close();
	   }
	   if (n==1) {
			// get default webcam and open it
			Webcam webcam = Webcam.getDefault();
			webcam.open();
	
			// get image
			BufferedImage image = webcam.getImage();
	
			// save image to PNG file
			ImageIO.write(image, "PNG", new File("test.png"));
			webcam.close();
			new client();
		
	   }
		
	}
}