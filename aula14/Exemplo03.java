public class Exemplo03 {
    public static void main(String[] args) {

        User user1 = new User(1, "Marcos", "marcos@email.com");
        User user2 = new User(2, "Ana", "ana@email.com");


        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());


    }
}
