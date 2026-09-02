import java.util.Arrays;//Função de ler do teclado
import java.util.Scanner;//Deixa +facil mexer em array
public class EntradaSaidaeAtribuição{
    public static void main(String[] args) {
        //Vou fazer oq aprendi de atribuição, entrada, saida e variaveis
          System.out.println("Váriaveis podem ser: \nInteiro: (1/2/6/43/etc)\nReal: (3,14/6,7/99,9/etc)\nLógico: (true/false)\nTexto/String: ('Abc/olá/oraoraora')\n\n\nDigite uma váriavel inteira: \n\n");
        //atribuição
            int nmeroInteiro;//Num inteiro
            double nmeroReal;//Num real
            boolean logico;//Lógico
            String Textozin;//Texto
            //em cima cria variável
            //em baixo atribui o valor
            nmeroInteiro = 10;
            nmeroReal = 3.14;
            logico = true;
            Textozin = "Olá, mundo :D";
        //entrada
            Scanner EntradaeSaida  = new Scanner (System.in);//faz ele ler o teclado "EntradaeSaida" é o nome do Scanner
                int numInt = EntradaeSaida.nextInt();
                System.out.println("Digite um número real: ");
                double numReal = EntradaeSaida.nextDouble();
                EntradaeSaida.nextLine();//Reseta o tipo de caractere
                System.out.println("Digite um texto ");
                String textoKK = EntradaeSaida.nextLine();
                
        //saída
                System.out.println("O número inteiro digitado foi: " + nmeroInteiro);
                System.out.println("O número real digitado foi: " + nmeroReal);
                System.out.println("O texto digitado foi: " + Textozin);
                
        /*Sintaxe
        Atribuição:

            int NomeDaVariavel; *Inteiro
            double NomeDaVariavel; *Real
            boolean NomeDaVariavel; *Lógico
            String NomeDaVariavel; *Texto

            *Criar já atribuindo/constante:
        
            int NomeDaVariavel = NumeroInteiro;
            E assim vai pro resto

        Entrada:
            Scanner Nome do seu scanner = new Scanner(System.in);

            NomeDaVariavel = NomeDoScanner.nextInt(); *Atribuindo valor pra uma já criada
            int NomeDaVariavel = NomeDoScanner.nextInt(); *Criando e atribuindo (O "int pode ser substituido pelos outros tipos (double, String, etc)")

        */
        //Arrays
            System.out.println("Existem também as Arrays que são uma estrutura de dados de tamanho fixo usada para armazenar vários valores do mesmo tipo em uma única variável;");

            //Ex
                //Só criando
                int[] Array_0;
                /*int é o tipo(pode ser qualquer 1);
                [] Fala q é array; Array_1 é o nome da variável; 
                Aqui ele só dá o nome, não guarda espaço na memória;
                */
                //Atribuindo direto
                String[] Array_1 = {"Do do do", "de", "da da da"};
                /*{} pra dar o valor 
                Aqui ele atribui junto
                */

                //Criando sem valor, define o tanto de coisa
                double [] Array_2 = new double[12];//Vou atribuit em código
                int [] Array_3 = new int [3];//Atribuir na execução
                /* new int cria a strinng na memória
                o [12] diz uma quantidade de itens máximo
                */
               //Atribuindo
               Array_2[0] = 2.22;
               Array_2[2] = 3444.23;
               Array_2[10] = 21.66666666666666667;
               /*
               Os arrays funcionam em indices, que começa em 0 e vai por ai
                *0 = 1
                *1 = 2
                O [0] coloca o 2 na primeira posição
                O [2] coloca o 3444 na terceira posição
               */    
    
            System.out.println("Digite 3 números");
            for (int ExArray = 0; ExArray <Array_3.length; ExArray++){
                
                Array_3[ExArray]=EntradaeSaida.nextInt();

            }
            System.out.println("Array_1(String):");
            System.out.println(Arrays.toString(Array_1));
            System.out.println("Array_2(Double):");
            System.out.println(Arrays.toString(Array_2));
            System.out.println("Array_3:");
            System.out.println(Arrays.toString(Array_3));

            /*Sintaxe longa e chata q EU escrevi pq a IA não me ajudou a entender essa merda, vtmnc IA tive que entender olhando sintaxe de C e de Python;
            
                As arrays podem ser de todos os tipos de variável, String, int, double e boolean;
            

                já expliquei como cria e atribui mas aq vai pra caso um "eu do futuro" esqueça:

                  *String[] Array_1 = {"Do do do", "de", "da da da"};

                    - String - é o tipo da array
                    - [] - diz que é uma array
                    - Array_1 - é o nome da Array
                    - {"do do do", "de"...} - é o conteudo, ele é separado por virgulas e tem que ter as aspas se for string

                  *double [] Array_2 = new double[12];
                    Array_2[0] = 2.22;
                    Array_2[2] = 3444.23;
                    Array_2[10] = 21.666

                    As arrays funcionam em indices (0=1, 1=2, etc...)

                    - double - Tipo do array
                    - [] - diz q é array
                    - Array_2 - é o nome do array
                    - new double - cria espaço na memória pra dar valor a array mais tarde
                    - []² - Diz quantas coisas podem dentro

                    - [0] - coloca o valor no lugar 1
                    - [2] - coloca o valor no lugar 3


                  *for (int ExArray = 0; ExArray <Array_3.length; ExArray++){
                    Array_3[ExArray]=EntradaeSaida.nextInt();}

                        - O for tá atribuindo o valor "ExArray" em um unico lugar da Array por vez-
                        - ExArray<Array_3.length - vai sempre verificar se o ExArray já chegou no limite da Array
                        - ExArray++ - vai para o próximo lugar na array

                        - Array_3 - Pega a array, onde vai guardar o valor
                        - [ExArray] - Puxa o valor que bota dentro da array e dá um valor pra ele com o negócio em baixo
                        - EntradaeSaida.nextInt() - Nome do Scanner e o método de leitura


                  *System.out.println(Arrays.toString(Array_1));
                        - Arrays.toString - Lê a string no literal, le um de cada vez noq ta nela. PRecisa da util "Arrays"
            */
    }
}
