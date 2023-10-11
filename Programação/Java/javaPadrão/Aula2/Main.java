

public class Main {
        public static void main(String[] args) {
        
            Aluno a1 = new Aluno("pedrinho", 5, 123);
            Pessoa p1 = new Pessoa("fausto", 23);

            System.out.println("nome: " + a1.getNome());
            System.out.println("idade: " + a1.getIdade());
            System.out.println("matricula: " + a1.getMatricula());
            System.out.println(); //pula uma linha
            System.out.println("nome pessoa: " + p1.getNome());
            System.out.println("idade pessoa: " + p1.getIdade());



    }
}

