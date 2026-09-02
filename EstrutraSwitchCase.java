
import java.util.Scanner;
public class EstrutraSwitchCase{
public static void main(String[] args) { //Vou tentar não enrolar muito
    System.out.println("A estrutura switch case é uma estrutura que difernte do if-else, compara o valor de uma variável com diferentes tipos de resultados, ela é utilizada quando há diversos valores possiveís para uma variavel evitando o excesso de if-else ");//Ia escreveu isso :0
     /*
        Sintaxe:
                switch (Nomedavariavel){
                    case (valor 1)
                        Codigo
                    case (valor 2)
                        codigo
                        break *tira desse bloco
                    default *Ultima opção, a "outro caso"
                }
        */
        /* 
            variavel_SwitchCase_1 é a variável que foi digitada.
            O código tá pegando essa variável e comparando com várias opções de casos (case 1, 2 e 3).
            Se bater com alguma, ele executa e usa o break pra sair, e se nenhuma der certo, ele cai no default pra avisar  que é inválido.
            <-Esses textos tão sendo feitos por IA pq eu não sei explicar e tenho preguiça->
         */

        //entrada
        Scanner SwitchCase = new Scanner (System.in);
            System.out.println("\n\n Bem vindo, escolha uma opção: \n(1)Azul\n(2)Verde\n(3)Vermelho");
                int variavel_SwitchCase_1 = SwitchCase.nextInt();
                    //Switch Case
                    switch (variavel_SwitchCase_1) { //Define variável a ser comparada
                         case 1://valor 1
                            System.out.println("Você escolheu azul...");
                        case 2://valor 2
                            System.out.println("Você escolheu verde...");
                        case 3://valor 3
                            System.out.println("Você escolheu vermelho...");
                            break;//Tira da estrutura SwitchCase
                        default://Se nenhuma der certo vai ser essa
                            System.out.println("Opção inválida...");
                    }
        SwitchCase.close();

       
    }

}
