import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

public class Main {
    public static void main(String[] argv) {
        final String HOUSE = "house.png";

        BufferedImage img1 = null;
        BufferedImage img2 = null;
        BufferedImage img3 = null;

        try {
            img1 = ImageIO.read(new File(HOUSE));
            img2 = ImageIO.read(new File(HOUSE));
            img3 = ImageIO.read(new File(HOUSE));
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedImage greyHouse = convert(img1 ,new GreyImageConverter());
        BufferedImage sepiaHouse = convert(img2 ,new SepiaImageConverter());
        BufferedImage inverseHouse = convert(img3, new InverseImageConverter());

        try {
            ImageIO.write(greyHouse, "png", new File("g_"+HOUSE));
            ImageIO.write(sepiaHouse, "png", new File("s_"+HOUSE));
            ImageIO.write(inverseHouse, "png", new File("i_"+HOUSE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage convert(BufferedImage img, IConverter converter) {
        return converter.convert(img);
    }
}
