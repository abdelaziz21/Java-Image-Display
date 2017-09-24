import javax.swing.*;
import java.awt.*;//need for graphics
//displays an image
public class ImageDisplay {
	public static void main(String[]args){
		JFrame frame = new JFrame();
		frame.setTitle("Picure");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicPanel panel = new GraphicPanel();
		frame.getContentPane().add(panel);		//	to do this
		frame.pack();
		frame.setSize(350, 250);			// set the size of the frame
		frame.setVisible(true);	
	}

}
