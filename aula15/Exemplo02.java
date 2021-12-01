import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exemplo02 {
    public static void main(String[] args) {

        User usuario = new User(1, "Arnaldo", "arnaldo@email.com");

        try {
            FileOutputStream arquivo = new FileOutputStream("arquivo.dat");
            ObjectOutputStream gravarObj = new ObjectOutputStream(arquivo);

            gravarObj.writeObject(usuario);

            gravarObj.flush(); // descarregar os dados do buffer
            gravarObj.close();
            arquivo.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        
    }
}
