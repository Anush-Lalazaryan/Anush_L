import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.*;

import javax.imageio.ImageIO;


public class hhhh {

	public static void main(String[] args) {
		
	    int width = 963;    //width of the image
	    int height = 640;   //height of the image
		BufferedImage image = null;
	    File f = null;

	    //read image
	    try{
	      f = new File("new.png"); //image file path
	      image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	      image = ImageIO.read(f);
	      System.out.println("Reading complete.");
	    }catch(IOException e){
	      System.out.println("Error: "+e);
	    }

	    //write image
	    try{
		      f = new File("javaMain.png");

		      if (f.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
	    	ImageIO.write(image, "png", f);
	      System.out.println("Writing complete.");
	    }catch(IOException e){
	      System.out.println("Error: "+e);
	    }
	}
}
