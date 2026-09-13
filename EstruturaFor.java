import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        //Esse aq tá BEM bagunçado
        System.out.println("A estrutura for é uma estrutura de repetição que executa um bloco de código um número determinado de vezes, ela é utilizada quando se sabe o número de repetições que se deseja realizar.");
        /*
        Sintaxe:
            for (ValorDaVariável; Condiçãopra ver se o bloco roda; Se aumenta ou diminui a variável) {
                //bloco de código a ser executado
                }
        */  
            Scanner Estrutura_For = new Scanner (System.in);
                System.out.println("\nDigite um número, o programa irá contar até aquele número:\n");
                    int ExemploFor1 = Estrutura_For.nextInt();
            for ( int Contador_for=0 ; ExemploFor1 >= Contador_for; Contador_for++) {
                System.out.println(Contador_for);
                if (Contador_for > ExemploFor1){
                    break;
                }
                else{
                }
        }
        Estrutura_For.close();
        /* *Contador_for* é a variável que tá sendo verificada 
            *ExemploFor* é a variável que foi digitada
            O código tá vendo se a primeira variável é do valor da segunda (ExemploFor1 >= Contador_for)
            E adiciona 1 no valor até chegar (Contador_for++)
        */  
        //outro 
            Scanner Estrutura_For2 = new Scanner(System.in);
            System.out.println("\nExiste também o 'For Each', que é utilizado para percorrer elementos de uma coleção, como arrays ou listas. Ele é mais simples e legível do que o for tradicional, mas não permite controlar o índice da iteração. \n");
            String[] Nomes ={"João", "Felipe", "Rick"};
            for (String Nome : Nomes){
                System.out.println(Nome);
            }
        /*
            String[] Nomes =... é a Array que o for vai tirar os valores
            *Nome* é a variável criada no for que vai ir recebendo os valores, tipo uma esteira
            ---------------------------------------
            for <-Começo do laço.
            (String <-Tipo de variável.
            Nome: <-Variável do For.
            Nomes) <- Variável onde tão armazenados os valores.
        */
    }
    
}
