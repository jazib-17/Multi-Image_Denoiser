package a3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * A simple representation of a color 2D image that allows the user to query the
 * dimensions of the image, retrieve an image pixel, and set an image pixel.
 * 
 * <p>
 * An image has a size defined by a positive integer width (in pixels) and positive
 * integer height (in pixels). 
 * 
 * <p>
 * Pixels are retrieved and set using 0-based row and column indexes. The upper-left
 * corner is the origin of the image (row = 0, column = 0).
 *
 */
public class SimpleImage {

	/*
	 * ADD THE FIELDS OF THE CLASS HERE
	 */
	
	
	
	/**
	 * Initialize an image to the specified width and height. The pixels of the
	 * image are set to {@code Color.BLACK}.
	 * 
	 * @param width  the width of the image
	 * @param height the height of the image
	 * @throws IllegalArgumentException if the width or height of the image is less
	 *                                  than 1
	 */
	public SimpleImage(int width, int height) {
		// IMPLEMENT THIS CONSTRUCTOR
		
	}

	/**
	 * Initialize an image by copying the specified image. The image has the
	 * same width and height of the copied image. The image has its own grid
	 * of pixels, and each pixel is equal to the corresponding pixel in the
	 * copied image.
	 * 
	 * @param img an image to copy
	 */
	public SimpleImage(SimpleImage img) {
		// IMPLEMENT THIS CONSTRUCTOR
		
	}

	/*
	 * ADD THE MISSING PUBLIC METHODS HERE
	 */
	
	
	
	
	
	
	

	/**
	 * IMPLEMENTED FOR YOU.
	 * 
	 * <p>
	 * Returns a {@code BufferedImage} having equal pixels as this image. This
	 * method can be used to provide a suitable image for the Java Standard
	 * Library classes that are part of the Abstract Window Toolkit.
	 * 
	 * @return a BufferedImage having equal pixels as this image
	 */
	public BufferedImage asBufferedImage() {
		BufferedImage b = new BufferedImage(this.width(), this.height(), BufferedImage.TYPE_INT_ARGB);
		for (int i = 0; i < this.height(); i++) {
			for (int j = 0; j < this.width(); j++) {
				b.setRGB(j, i, this.get(i, j).getRGB());
			}
		}
		return b;
	}
	
	/**
	 * Creates and displays a SimpleImage.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		SimpleImage img = new SimpleImage(100, 50);
		/*
		 * You can try using the set method here to change some of the pixels in img
		 */
		
		
		
		JFrame frame = new JFrame("SimpleImage");
		frame.setMinimumSize(new Dimension(500, 100));
		frame.getContentPane().setLayout(new FlowLayout());
		BufferedImage buf = img.asBufferedImage();
		frame.getContentPane().add(new JLabel(new ImageIcon(buf)));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
