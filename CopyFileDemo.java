import java.io.*;

class CopyFileDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\pulak\\OneDrive\\Desktop\\LC.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\pulak\\OneDrive\\Desktop\\LC-Copied.txt");

        int data;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        System.out.println("File copied successfully!");
    }
}
