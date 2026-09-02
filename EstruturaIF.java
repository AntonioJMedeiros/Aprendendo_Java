import java.util.Scanner;
public class EstruturaIF {
    public static void main(String[] args) {
        //atribuição
        boolean logica_ex1 = false;
        //fazer oq eu sei de IF (quase nada)
         System.out.println("A estrutura IF é uma estrutura de decisão, que vai decidir oq o código vai fazer se a condição for verdadeiro ou falso. \n\n");//Ia q escreveu isso 
            Scanner Ifelse = new Scanner (System.in);
            System.out.println("Digite duas variáveis inteiras;\n1ªVariável: ");
            int variavel_ex1 = Ifelse.nextInt();
            System.out.println("Digite a 2ª Variável: ");
            int variavel2_ex1 = Ifelse.nextInt();
            //Hora do vamo ver
                if (variavel_ex1 > variavel2_ex1){
                     logica_ex1 = true;
                    System.out.println("Variável 1 '" +variavel_ex1+"' é maior que variável 2 '" +variavel2_ex1+"''");
                }
                else if (variavel_ex1 == variavel2_ex1){
                     logica_ex1 = true;
                    System.out.println("Variável 1 '"+variavel_ex1+"' é igual a Variável 2 '"+variavel2_ex1+"'");
                }
                else {
                    System.out.println("Variável 1 '"+variavel_ex1+"' é menor a Variável 2 '"+variavel2_ex1+"'");
                     logica_ex1 = false;
                }

                /* 
                    variavel_ex1 e variavel2_ex1 são as variáveis que foram digitadas.
                    O código tá vendo se a primeira variável é maior, menor ou se é do mesmo valor da segunda.
                    Dependendo da resposta, ele muda o estado da variável logica_ex1 pra verdadeiro ou falso e usa um outro IF embaixo pra checar ela.
                    */
            //segunda vez
                if (logica_ex1){
                    System.out.println("Essa variável é verdadeira :D");
                }
                else{
                    System.out.println("Essa variável é falsa :/");
                }

    }
}
