public class operadoresTernário {

    public static void  main (String[] args) {

        /*
        <200 reais não tem desconto
        201 e 400 - 20%
        401 e 800 - 30%
        > 801 - 40%



        double compras= 576;



        if (compras <= 200){
            System.out.println("Não tem desconto");
        } else if ( compras >= 201 && compras < 400 ){
            System.out.println ("desconto de 20%");
        } else if ( compras >= 401 && compras < 800 ){
            System.out.println ("desconto de 30%");
        }else if ( compras >= 801 ){
            System.out.println ("desconto de 40%");


            Operador ternário:
            (Condição) ? verdade : falso

        }*/

        /*int idade = 12;

        String texto = idade >= 18 ? "Maior idade": "Menor idade";
            System.out.println("Resultado "+texto);*/

        int opcao= 3;

        switch ( opcao) {
            case 1:
                System.out.println("Saldo atual");
                break;
            case 2:
                System.out.println("Extrato");
                break;
            case 3:
                System.out.println("Cartões de crédito");
                break;


        }
    }
}
