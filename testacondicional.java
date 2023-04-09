public class testacondicional{
    public static void main(String[] args){
        System.out.println("Testando variáveis!");
        int idade = 18;
        int quantidadePessoas = 1;
        if(idade >= 18){
            System.out.println("Você tem mais de 18 anos de idade");
            System.out.println("Seja Bem Vindo!");
        }
        
        else {
            if(quantidadePessoas >=2) {
                System.out.println("Você não tem 18 anos mais está acompanhado,"+
                "então pode entrar");
            }
            else{
                System.out.println("Você não tem 18 anos de idade");
            }
        }
    
    }


}