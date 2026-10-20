public class Cao {
    private int idade ;

    public void setIdade(int i){
        idade = i;
    }

    public int getIdade(){
        return idade;
    }

    public void Andar(){
        System.out.println("Estou andando");
    }


    public boolean VerificarIdade(){
        if (idade> 10){
            return true;
        }
        else{
            return false;
        }
    }
}
