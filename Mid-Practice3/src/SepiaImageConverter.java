import java.awt.image.*;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.nio.Buffer;


class SepiaImageConverter implements IConverter{
    @Override
    public BufferedImage convert(BufferedImage image) {
        for(int y = 0; y < image.getHeight(); y++) {
            for(int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y));
                int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                int outputRed = 230 * grey / 255;
                int outputGreen = 180 * grey / 255;
                int outputBlue =  150 * grey / 255;
                image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
        }

        return image;
    }
}