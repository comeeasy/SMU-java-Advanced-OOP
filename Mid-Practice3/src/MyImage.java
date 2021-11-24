import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyImage{
    private BufferedImage img;

    public MyImage(String filename) {
        try {
            img = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public BufferedImage convert(IConverter converter) {return converter.convert(this.img);}
    public BufferedImage getImg() {return this.img;}
    public void setImg(BufferedImage image) {this.img = image;}
}
