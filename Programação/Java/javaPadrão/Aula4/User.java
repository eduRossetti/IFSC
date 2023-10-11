package Aula4;

public class User {
    
    private String firstName;
    private int numero;
  
    public User(String firstName, int numero){
        this.firstName = firstName;
        this.numero = numero;
      }
  
      public User() {}
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
