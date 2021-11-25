public class User {
    private int id;
    private String nome;
    private String email;

    public User(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id ;
    }

/*     @Override
    public int hashCode() {
        return id + nome.hashCode() + email.hashCode();
    } 

*/

    @Override
    public String toString() {
        return "User [id= " + id + ", email=" + email + ", nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj);
    }

}
