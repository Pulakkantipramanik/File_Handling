/* Write on File */

import java.io.FileWriter;
import java.io.IOException;

class fileWriterDemo {

    public static void main(String[] args) {

        try {
            FileWriter f = new FileWriter("C:\\Users\\pulak\\OneDrive\\Desktop\\LCC.txt");

            f.write("Welcome To Kolkata  ..! ");

            f.close();  // closing FileWriter

            System.out.println("Successfully wrote data in the file.");
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}
