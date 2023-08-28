import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtilities {

    public static String readFile(String fileName) throws IOException {
        String holder = "";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            holder += (char) (reader.read());
        }
        reader.close();
        return holder;
    }

    public static void writeFile(String words, String outputFileName) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(outputFileName);
        pw.write(words);
        pw.close();
    }
}
