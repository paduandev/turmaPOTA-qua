// import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exemplo03 {
    public static void main(String[] args) {
        // File file = new File("arquivo.txt");
        User usuario;

        try {
            FileInputStream arquivo = new FileInputStream("arquivo.dat");
            ObjectInputStream gravarObj = new ObjectInputStream(arquivo);

            usuario = (User) gravarObj.readObject();

            System.out.println(usuario);

            gravarObj.close();
            arquivo.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        
    }
}
