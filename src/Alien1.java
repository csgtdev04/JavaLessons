import java.awt.*;
import java.awt.image.BufferedImage;

public class Alien1 {
    public static void main(String[] args) {
        // set up the drawing canvas
        int pageWidth = 600;
        int pageHeight = 600;
        BufferedImage bufferedImage = new BufferedImage(pageWidth, pageHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D page = bufferedImage.createGraphics();
    }
}
