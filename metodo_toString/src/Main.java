class Main{
    public static void main(String[] args){
        String primeira = "Java";
        String segunda = "Csharp";
        String terceira = new String("Python");

        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);


        //comparar a primeira com a segunda String
        boolean result = primeira.equals(segunda);

        System.out.println("Primeira é igual a segunda? " + result);

        //comparar a segunda com a terceira
        result = segunda.equals(terceira);
        System.out.println("Segunda é igual a terceira? " + result);
    }
}