package Projeto_Ominitrix;

import java.util.Scanner;
import java.util.ArrayList;

public class Ominitix {
    public static void main(String[] args) {
        
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        ArrayList <String> aliens = new ArrayList<String>();

        aliens.add("4 braços");
        aliens.add("enormossauro");
        aliens.add("friagem");
        aliens.add("chama");
        aliens.add("gosma");
        aliens.add("rath (irado)");
        
        do{
            System.out.println("1- Escanear um novo alien");
            System.out.println("2- Transformar-se em um alien");
            System.out.println("3- Sair do ominitrix");
            System.out.println("4- Ver todos os aliens disponiveis");
            op = teclado.nextInt();

            if(op == 1){
                String alien_novo;
                System.out.println("Digite o nome do novo alien");
                alien_novo = teclado.next();
                aliens.add(alien_novo);

            }

            if(op == 2){
                int escolha;
                System.out.println("Escolha o seu alien:");

                for(int i = 0; i < aliens.size(); i++){
                    System.out.println(i + "- " + aliens.get(i));
                }
                escolha = teclado.nextInt();
                System.out.println("Alien escolhido: " + aliens.get(escolha));

            }

            if(op == 4){
                for(int i = 0; i < aliens.size(); i++){
                    System.out.println(i + "- " + aliens.get(i));
                }
                System.out.println("");
            }
        }while(op != 3);
        
        System.out.println("Você saiu do ominitrix!");
    }
    
}
