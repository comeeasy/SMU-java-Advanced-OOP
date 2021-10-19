import java.awt.image.BufferedImage;
import java.nio.Buffer;

public abstract class DecoConverter extends BufferedImage{
    public DecoConverter(int width, int height, int imageType) {
        super(width, height, imageType);
    }

    public BufferedImage convert(BufferedImage image) {
        return null;
    }
}