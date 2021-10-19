import java.awt.image.BufferedImage;

public class DGreyConverter extends DecoConverter{
    private IConverter greyConverter = null;
    private BufferedImage bufImg = null;

    public DGreyConverter(int width, int height, int imageType) {
        super(width, height, imageType);
        this.greyConverter = new GreyImageConverter();
    }

    public DGreyConverter(BufferedImage img) {
        super(img.getWidth(), img.getHeight(), img.getType());
        bufImg = img;
    }

    @Override
    public BufferedImage convert(BufferedImage image) {
        return greyConverter.convert(image);
    }
}
