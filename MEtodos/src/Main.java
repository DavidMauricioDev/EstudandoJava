class Main{
    public static void main(String[] args){

       Cao cachorro = new Cao();
       cachorro.setIdade(5);

       if (cachorro.VerificarIdade()){
           System.out.println("Idoso");
       }
       else{
           System.out.println("É novinho");
       }

    }
}
