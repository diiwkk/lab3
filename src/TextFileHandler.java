import java.io.*;

public class TextFileHandler implements FileHandler {

    // The file to be handled.
    private File file;

    public TextFileHandler(String filename) throws FileNotFoundException {
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
        // Create a buffered reader to read the file line by line.
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // Read each line of the file and print it to the console.
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // Close the buffered reader.
        reader.close();
    }

    @Override
    public void close() throws IOException {
        file.list();
    }
}
