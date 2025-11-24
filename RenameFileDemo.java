import java.io.File;

class RenameFileDemo {
    public static void main(String[] args) {

        // Step 1: Original file path
        File originalFile = new File("C:\\Users\\pulak\\OneDrive\\Desktop\\LC_Pulak.txt");

        // Step 2: New file name (same folder)
        File renamedFile = new File("C:\\Users\\pulak\\OneDrive\\Desktop\\LC_Ranjit.txt");

        // Step 3: Check if file exists
        if (originalFile.exists()) {

            // Step 4: Rename the file
            boolean result = originalFile.renameTo(renamedFile);

            if (result) {
                System.out.println("File renamed successfully!");
            } else {
                System.out.println("Failed to rename file.");
            }

        } else {
            System.out.println("File does not exist!");
        }
    }
}
