import java.util.HashMap;

public class Exemplo02 {
    public static void main(String[] args) {
        HashMap<Integer, User> mapa = new HashMap<>();

        User user1 = new User(1, "Marcos", "marcos@email.com");
        User user2 = new User(2, "Ana", "ana@email.com");

        mapa.put(user1.getId(), user1);
        mapa.put(user2.getId(), user2);

        System.out.println( mapa.get(2) );
    }
}
