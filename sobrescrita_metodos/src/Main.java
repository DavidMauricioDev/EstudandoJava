class Linguagem {
    public void mostrarInformacao() {
        System.out.println("Lingua Portuguesa");

    }
}
class Java extends Linguagem {
    public void mostrarInformacao(){
        System.out.println("Linguagem Java");

    }
}
class Main{
    public static void main(String[] args){
      //criar objeto da linguagem Java

        Java j1 = new Java();
        j1.mostrarInformacao();

        Linguagem l1 = new Linguagem();
        l1.mostrarInformacao();
    }
}