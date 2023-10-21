import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageFileHandler implements FileHandler {

    // The file to be handled.
    private File file;

    public ImageFileHandler(String filename) throws FileNotFoundException {
        this.file = new File(filename);
    }

    @Override
    public void open() throws FileNotFoundException {
        file.toPath();
    }

    @Override
    public void open(String filename) throws FileNotFoundException {

    }

    @Override
    public void read() throws IOException {
        // Read the image file into a BufferedImage object.
        BufferedImage image = ImageIO.read(file);

        // Print the image to the console.
        System.out.println(image);
    }

    @Override
    public void close() throws IOException {
        file.list();
    }
}
