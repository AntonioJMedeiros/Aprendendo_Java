
import java.util.Scanner;
public class EstruturaWhile{
    public static void main(String[] args) {
          /*
        Sintaxe:
        while(condição){
        código
        }*/

        //Sei lá agr
            System.out.println("A estrutura while é uma estrutura de repetição que executa um bloco de código enquanto uma condição for verdadeira.");
        //Isso aq vai fazer ele repitir pro resto da vida 
            int Numero_While = -10;//Tem q ser diferente de 0 pq ele vai verificar se o valor é 0 pra sair
        //Vamo ver
            Scanner ExemploWhile = new Scanner (System.in);
                while (Numero_While !=0){ //enquanto a variável for diferente de 0 (!= significa diferente de)
                    System.out.println("Digite um número (0 Para sair)");
                        Numero_While =ExemploWhile.nextInt();
            }
        System.out.println("Fim");
        ExemploWhile.close();

        /* 
            Numero_While é a variável que começa valendo -10 e tá sendo verificada.
            O código tá vendo primeiro se o valor dela é diferente de zero (Numero_While != 0).
            E continua pedindo pra digitar um número novo dentro da repetição até que a pessoa digite 0 pro código acabar.
            */
    }
}

