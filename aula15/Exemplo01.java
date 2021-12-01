import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        InputStream input;

        try {
            input = new BufferedInputStream( new FileInputStream("arquivo.txt"));

            int data = input.read();
            while(data != -1) {
                System.out.print((char)data);
                data = input.read();
            }

            input.close();

        } catch (Exception e) {
            System.out.println("Erro "+ e.getMessage());
        }
        
    }
}