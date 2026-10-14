import java.util.Scanner;


class Main {
    public static void main(String[] args){

        System.out.println("Digite seu nome:");

        String palavra;
        Scanner entrada = new Scanner(System.in);
        palavra = entrada.next();

        System.out.println("Palavra:" + palavra);
    }
}
