import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public interface FileHandler {

    void open() throws FileNotFoundException;

    // Opens the file specified by the given filename.
    void open(String filename) throws FileNotFoundException;

    // Reads the contents of the file.
    void read() throws IOException;

    // Closes the file.
    void close() throws IOException;
}

