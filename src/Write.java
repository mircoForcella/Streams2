import java.io.*;
import java.time.LocalDateTime;

public class Write {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        try {
            FileReader fileReader = new FileReader("resources/file.txt");
            BufferedReader bR = new BufferedReader(fileReader);
            String checkNullFile = bR.readLine();
            System.out.println(checkNullFile);
            FileWriter fileWriter = new FileWriter("resources/file.txt");
            BufferedWriter bW = new BufferedWriter(fileWriter);

            if (checkNullFile == null) {
                System.out.println("New information was generated");
                bW.write(String.valueOf(now));
                bW.close();
            } else {
                bW.write(String.valueOf(now));
                bW.close();
                System.out.println("The documentation was already recorded, the time is getting updated");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
