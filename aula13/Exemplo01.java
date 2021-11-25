import java.util.HashMap;

public class Exemplo01 {

    public static void main(String[] args) {
        // <Chave, Valor>
        HashMap<Integer, String> mapa = new HashMap<>();

        // armazena na chave Int os conteúdos String
        mapa.put(3, "Três");
        mapa.put(1, "Um");
        mapa.put(2, "Dois");

        // Consultar pela chave
        System.out.println( mapa.get(2) );
        System.out.println( mapa.get(4) );

    }
}