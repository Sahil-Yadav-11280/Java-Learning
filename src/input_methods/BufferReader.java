import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader is faster than scanner because it loads a chunk rather than a character(in scanner) at a time and store that chunk in RAM for faster retrieval

@SuppressWarnings("unused")
public class BufferReader {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String name = reader.readLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println(((Object)age).getClass());

        
    }
}