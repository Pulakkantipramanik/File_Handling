import java.io.FileReader;
import java.io.IOException;

class FileReadDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // Step 1: Open file
            fr = new FileReader("C:\\Users\\pulak\\OneDrive\\Desktop\\LC.txt");
            int i;
            // Step 2: Read character-by-character
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);  // Convert int → char
            }
            System.out.println("\n\nFile reading completed.");
        } catch (IOException e) {
            // Step 3: Handle errors
            System.out.println("Exception handled: " + e);

        } finally {
            // Step 4: Always close file
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                System.out.println("Error while closing file: " + e);
            }

            System.out.println("File closed.");
        }
    }
}
