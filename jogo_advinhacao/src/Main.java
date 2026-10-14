import java.util.Scanner;
import java.util.Random;


class Main{
    public static void main(String[] args){
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Advinhe o número que estou pensando ");
        int numero = entrada.nextInt();

        if(numero == x){
            System.out.println("Parabéns, você acertou, eu pensei no " + x);
        }
        else{
            System.out.println("Você eroooooooouuu!!! Eu pensei no " + x);
        }





    }
}