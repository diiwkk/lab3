import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Create file handlers for a text file and an image file.
        FileHandler textFileHandler = new TextFileHandler("my_text_file.txt");
        FileHandler imageFileHandler = new ImageFileHandler("my_image_file.jpg");

        // Create adapters for the text and image file handlers.
        Adapter textAdapter = new Adapter(textFileHandler);
        Adapter imageAdapter = new Adapter(imageFileHandler);

        // Open, read, and close the text file.
        textAdapter.open();
        textAdapter.read();
        textAdapter.close();

        // Open, read, and close the image file.
        imageAdapter.open();
        imageAdapter.read();
        imageAdapter.close();
    }
}
