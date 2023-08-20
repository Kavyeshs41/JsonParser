import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample-text.json"));
        for (String line; (line = br.readLine()) != null; ) {
            System.out.println(line);
        }
        br.close();
    }
}