import java.io.FileNotFoundException;
import java.io.IOException;

public class Adapter implements FileHandler {

    // The file handler to be adapted.
    private final FileHandler fileHandler;

    public Adapter(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    @Override
    public void open() throws FileNotFoundException {
        fileHandler.open();
    }

    @Override
    public void open(String filename) throws FileNotFoundException {

    }

    @Override
    public void read() throws IOException {
        fileHandler.read();
    }

    @Override
    public void close() throws IOException {
        fileHandler.close();
    }
}
