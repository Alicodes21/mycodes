package Day2.Day6;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        String strings[] = {
                "This is a dog",
                "This is a cat",
                "This is an elephant",
                "This is a lion"
        };
        File inFile = new File("C:\\Users\\Admin\\MyJava\\input.txt");

        try {
            // Write some text into "readfile.txt"
            FileWriter fw = new FileWriter("C:\\Users\\Admin\\MyJava\\readfile.txt");
            fw.write("Writing on the readfile.txt with the filewriter class ");
            fw.write("Java is fun ");
            fw.close();

            // Read from "readfile.txt" and write into "input.txt"
            FileReader read = new FileReader("C:\\Users\\Admin\\MyJava\\readfile.txt");
            FileWriter write = new FileWriter("C:\\Users\\Admin\\MyJava\\input.txt");

            int ch;
            while ((ch = read.read()) != -1) {
                write.write(ch);
            }

            read.close();
            write.close();
            System.out.println("successfully written in the file ");

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
