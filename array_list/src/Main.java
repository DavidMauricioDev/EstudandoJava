import java.util.ArrayList;

class Main{
    public static void main(String[]args){
        ArrayList<String> estados = new ArrayList<>();

        estados.add("Espirito Santo");
        estados.add("Ceará");
        estados.add("Rio de Janeiro");
        estados.add("Pernambuco");

        estados.remove("Ceará");

        System.out.println(estados);



    }
        }
