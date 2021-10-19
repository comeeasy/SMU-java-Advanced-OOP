import java.awt.image.*;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

class InverseImageConverter implements IConverter{
    @Override
    public BufferedImage convert(BufferedImage image) {
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y));
                int outputRed = 255 - color.getRed();
                int outputGreen = 255 - color.getGreen();
                int outputBlue = 255 - color.getBlue();
                image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
        }

        return image;
    }
}