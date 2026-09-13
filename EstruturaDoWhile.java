
import java.util.Scanner;
public class EstruturaDoWhile {
    public static void main(String[] args) {
        /*Sintaxe:
            do{
            Bloco de código
            }while (condição) pode ser booleana tbm
            */

        System.out.println("A estrutura do while é uma estrutura de repetição que executa um bloco de código pelo menos uma vez e depois verifica a condição para continuar ou não.");//Ia q disse

        Scanner ExemploDoWhile = new Scanner(System.in);
            int Variavel_Dowhile;
            System.out.println("Escolha uma opção:\n(1)Repetir\n(2)Sair");
            do { //Vai fazer oq tá entre as chaves enquanto
                Variavel_Dowhile = ExemploDoWhile.nextInt();
            } while (Variavel_Dowhile != 2); //A variável for diferente de 2
            System.out.println("Cabou:#");

            /* 
                Variavel_Dowhile é a variável que foi digitada.
                O código faz a leitura da opção acontecer pelo menos uma vez antes de checar qualquer regra.
                Depois ele tá vendo se o número digitado é diferente de 2 (Variavel_Dowhile != 2), e enquanto for diferente, ele continua repetindo tudo.
                */

            
    }
    
}