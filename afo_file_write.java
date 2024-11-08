import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filename = args[0];
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write("Example content".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
