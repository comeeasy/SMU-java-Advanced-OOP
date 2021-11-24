import java.awt.image.BufferedImage;

public class GreyConvertedImage extends DecoConvertedImage{
    private BufferedImage img;
    private IConverter converter;

    public GreyConvertedImage(BufferedImage image) {
        super(image.getWidth(), image.getHeight(), image.getType());
        this.img = image;
        converter = new GreyImageConverter();
    }

    public BufferedImage convert() {
        return
    }
}
