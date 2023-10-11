package Aula3;

import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> contatos = new ArrayList <String> ();
        ArrayList <Integer> numeros = new ArrayList<Integer>();

        int op;

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("1- add contato: ");
            System.out.println("2- remover contato: ");
            System.out.println("3- ver todos os contatos: ");
            System.out.println("4- Sair ");
            op = teclado.nextInt();

            if(op == 1){
                String nome;
                int numero;
                System.out.println("Escreva seu nome: ");
                nome = teclado.next();
                System.out.println("Escreva seu numero: ");
                numero = teclado.nextInt();

                contatos.add(nome);
                numeros.add(numero);
            }

            if(op == 2){
                if(contatos.size() == 0){
                    System.out.println("lista vazia! ");
                }

                else{
                    System.out.println("digite o numero do ctt que deseja excluir: ");
                    int i = teclado.nextInt();
                    contatos.remove(i);
                    numeros.remove(i);
                    System.out.println("Contato excluido!");
                }
            }

            if(op == 3){
                for(int i = 0; contatos.size() > i; i++){
                    System.out.println("nome " + (i+1) + ": " + contatos.get(i));
                    System.out.println("numero " + (i+1) + ": " + numeros.get(i));
                }
            }
            
            if(op == 4){
                System.out.println("você saiu do sistema!");
            }

    } while(op != 4);


}
}