import java.io.*;

class CreateFile {
    public static void main(String[] args)   {
        File file = new File("C:\\Users\\pulak\\OneDrive\\Desktop\\LCC.txt");
        try {

            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Exception Occured");
        }
    }
}