import java.io.*;
import java.awt.Desktop;

public class OpenFileDemo {
    public static void main(String[] args) {

        try {
            File f = new File("C:\\Users\\pulak\\OneDrive\\Desktop\\LCC.txt");

            if (f.exists()) {
                // Open the file
                Desktop.getDesktop().open(f);
                System.out.println("File opened successfully!");
            } else {
                System.out.println("File not found!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
