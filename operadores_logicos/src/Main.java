
/*
class Main {
    public static void main (String[] args){
        int a, b;
        a = 4;
        b = 8;

        System.out.println(a > b);
        System.out.println(a > b && b == 8);

    }
}*/

/*class Main {
    public static void main (String[] args){

        int nota = 5;

        if (nota >= 5){
            System.out.println("Aprovado");
        }
        else if ( nota >= 3 && nota < 5){
            System.out.println("Recuperação");
        }
        else System.out.println("Reprovado");
    }
}*/
import java.util.Scanner;


class Main{
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar aluno: ");
        System.out.println("2 - Cadastrar notas: ");
        System.out.println("3 - Listar alunos e nota: ");

        int numero = entrada.nextInt();

        switch (numero){
            case 1:
                System.out.println("Vamos cadastrar aluno");
            break;
            case 2:
                System.out.println("Vamos cadastrar nota");
            break;
            case 3:
                System.out.println("Listar alunos");
            break;
            default:
                System.out.println("Número inválido");

        }
    }
}