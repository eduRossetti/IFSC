package Aula1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    String Marca;
    int Valor;
    String Cor;
    

    Scanner teclado =  new Scanner(System.in);
    moto m1 = new moto();


    System.out.println("digite a marca da moto:");
    Marca = teclado.next();
    m1.setMarca(Marca);
    if(Marca.equals("honda") || Marca.equals("Honda")){
        System.out.println("podre pra caraamba");
        return;
    }

    System.out.println("digite o valor da moto:");
    Valor = teclado.nextInt();
    m1.setValor(Valor);

    System.out.println("digite a cor da moto:");
    Cor = teclado.next();
    m1.setCor(Cor);

    System.out.println("Marca: "+ Marca);
    System.out.println("Valor: R$ "+ Valor);
    System.out.println("Cor: "+ Cor);
}
}