import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Alien {

    public static void main(String[] args) throws IOException {
        // set up the drawing canvas
        int pageWidth = 600;
        int pageHeight = 600;
        BufferedImage bufferedImage = new BufferedImage(pageWidth, pageHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();

        // Fill in the entire background before drawing
        g.setColor(Color.white);
        g.fillRect(0,0,pageWidth,pageHeight);

        // face
        g.setColor(new Color(144, 238, 144));
        g.fillOval(225, 10, 150, 150);


        File file = new File("coordinates.png");
        int width = pageWidth / 3;
        int height = pageHeight / 3;

        drawHead(g, width, height);
        drawBody(g, width, height);
        drawArms(g, width, height);
        drawLegs(g, width, height, bufferedImage, file);
    }

    public static void drawHead(Graphics2D p, int w, int h) {
        // eyes
        makeEyes(p, w, h);
        //pupils & ears
        makePupilsAndEars(p, w, h);
        //nose/nostrils
        makeNose(p, w, h);
        //mouth
        makeMouth(p, w, h);
    }

    private static void makeMouth(Graphics2D p, int w, int h) {
        int mouthWidth = (int) (w/5);
        int mouthHeight = (int) (h/10);
        int mouthX = (int) ((w/8) + mouthWidth*6.4);
        int mouthY = (int) ((h/1.7) + (mouthHeight/2));
        int rmouth=0;
        int gmouth=100;
        int bmouth=0;
        p.setColor(new Color(rmouth, gmouth, bmouth));
        p.fillRect(mouthX, mouthY, mouthWidth, mouthHeight);
    }

    private static void makeNose(Graphics2D p, int w, int h) {
        int noseWidth = (w/10);
        int noseHeight = (h/10);
        int nostrilWidth = (w/7);
        int nostrilHeight = (h/10);
        int Xnose = (int) ((w) + noseWidth*4.5);
        int nostrilX =  (int)((w) + noseWidth*4.33);
        int noseY = (int) (h/2.5);
        int nostrilY = (int) (h/2.1);
        int rnose=160;
        int gnose=80;
        int bnose=45;
        p.setColor(new Color(rnose, gnose, bnose));
        p.fillRect(Xnose, noseY, noseWidth, noseHeight);
        p.fillOval(nostrilX, nostrilY, nostrilWidth, nostrilHeight);
    }


    private static void makePupilsAndEars(Graphics2D p, int w, int h) {
        int pupilWidth = (w / 20);
        int pupilHeight = (h / 20);
        int leftXpup = (int) ((w) + pupilWidth * 12.5);
        int rightXpup =  (int) ((w) + pupilWidth * 6.5);
        int eyeYpup = ((h/3) - (pupilHeight / 2));
        p.setColor(new Color(0, 0, 0));
        p.fillOval(leftXpup, eyeYpup, pupilWidth, pupilHeight);
        p.fillOval(rightXpup, eyeYpup, pupilWidth, pupilHeight);

        int earWidth = (w/10);
        int earHeight = (h/10);
        int leftXear = (int) ((w) + pupilWidth*16.5);
        int rightXear =((w) + pupilWidth*2);
        int earY = ((h/3) - (pupilHeight/2));
        int rear=235;
        int gear=190;
        int bear=150;
        p.setColor(new Color(rear, gear, bear));
        p.fillOval(leftXear, earY, earWidth, earHeight);
        p.fillOval(rightXear, earY, earWidth, earHeight);
    }

    private static void makeEyes(Graphics2D p, int w, int h) {
        int eyeWidth = w / 10;
        int eyeHeight = (h / 10);
        int leftX = ((w) + eyeWidth * 3);
        int rightX = ((w) + eyeWidth*6);
        int eyeY = (h / 3 - eyeHeight / 2);
        p.setColor(new Color(0, 0, 0));
        p.fillOval(leftX, eyeY, eyeWidth, eyeHeight);
        p.fillOval(rightX, eyeY, eyeWidth, eyeHeight);
    }

    public static void drawBody(Graphics2D p, int w, int h) {
        makeNeck(p, w, h);
        makeTorsoAndCore(p, w, h);
    }

    private static void makeTorsoAndCore(Graphics2D p, int w, int h) {
        int torsoWidth = (w/2);
        int torsoHeight = (h/1);
        int torsoX = ((w/4) + torsoWidth*2);
        int torsoY = (int) ((h/50) + (torsoHeight/1.17));
        int rtorso=150;
        int gtorso=0;
        int btorso=0;
        p.setColor(new Color(rtorso, gtorso, btorso));
        p.fillRect(torsoX, torsoY, torsoWidth, torsoHeight);

        int coreWidth = (int) (w/6);
        int coreHeight = (int) (h/6);
        int coreX = (int) ((w/2) + torsoWidth*1.85);
        int coreY = (int) ((h/5) + (torsoHeight));
        int rcore=255;
        int gcore=215;
        int bcore=0;
        p.setColor(new Color(rcore, gcore, bcore));
        p.fillOval(coreX, coreY, coreWidth, coreHeight);
    }

    private static void makeNeck(Graphics2D p, int w, int h) {
        int neckWidth = (w/10);
        int neckHeight = (h/10);
        int neckX = (int) ((w/4) + neckWidth*12.1);
        int neckY = (int) ((h/2) + (neckHeight*2.8));
        int rneck=150;
        int gneck=0;
        int bneck=0;
        p.setColor(new Color(rneck, gneck, bneck));
        p.fillRect(neckX, neckY, neckWidth, neckHeight);
    }


    public static void drawArms(Graphics2D p, int w, int h) {
        //arms
        int armWidth = (int) (w * 1.5);
        int armHeight = (h / 10);
        int armX = (w/2 + armWidth/6);
        int armY = (int) (h + (armHeight/1.17));
        int rarm=150;
        int garm=0;
        int barm=0;
        p.setColor(new Color(rarm, garm, barm ));
        p.fillRect(armX, armY, armWidth, armHeight);
    }

    public static void drawLegs(Graphics2D p, int w, int h, BufferedImage bI, File f)
            throws IOException {
        //legs
        int legWidth = (w/10);
        int legHeight = (h/2);
        int leftX = (int) ((w*1.151) + legWidth);
        int rightX =  (int)((w*1.55) + legWidth);
        int legY = (int) ((h*1.2) + (legHeight));
        int rleg=150;
        int gleg=0;
        int bleg=0;
        p.setColor(new Color(rleg, gleg, bleg));
        p.fillRect(leftX, legY, legWidth, legHeight);
        p.fillRect(rightX, legY, legWidth, legHeight);

        ImageIO.write(bI, "png", f);
        // cleanup
        //page.dispose();
    }
}