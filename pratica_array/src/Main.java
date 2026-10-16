import java.util.ArrayList;


class Main{
    public static void main(String[]args){
        ArrayList<String> bandas = new ArrayList<String>();

        bandas.add("Kiss");
        bandas.add("Beatles");
        bandas.add("Iron Maiden");

        System.out.println(bandas);

        bandas.add(bandas.indexOf("Kiss"), "Capital Inicial"); // comando para adicionar e substituir posição

        System.out.println(bandas);
        bandas.remove("Kiss"); // Comando para remover
        System.out.println(bandas);

        bandas.clear(); // Comando para limpar
        System.out.println(bandas);

    }
}