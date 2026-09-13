public class Operadores{
    public static void main(String[] args) {
        //Operações matemáticos
        
        System.out.println("\nOperadores Algébricos: \nExistem no total 5 operadores algébricos em java, são eles:\nAdição(+), Subtração(-), Multiplicação(*), Divisão(/), Resto/Módulo(%).");

        int Adicao = 10 + 12;//Soma
        int Subtracao = 44 - 23;//Diminui
        int Multiplicacao = 2 * 8;//Multplica
        int Divisao = 25/5;//Divide
        int Resto = 5%20;//Restante da divisão
        System.out.println("Adição: 10 + 12 = "+Adicao+"\nSubtração: 44 - 23 = "+Subtracao+"\nMultiplicação: 2 * 8 = "+Multiplicacao+"\nDivisão: 25 / 5 = "+Divisao+"\nResto: 5 % 20 = "+Resto+".");
        System.out.println("Eles podem ser usados para somar duas variáveis;");
        System.out.println(Adicao + Subtracao * Multiplicacao / Divisao - Resto);

        /*ORDEM DE CONTA
        * / % <- Primeiro
        + - <- Segundo
        = <- terceiro
        */

        System.out.println("\nOperadores de atribuição:Eles servem para alterar o valor de uma variável\nExistem 5 operadores de atribuição, são eles:\n=;\n+=;\n-=;\n*=;\n/=;\n%=.");

        int atribui = 5;//Só atribui
        int atribuiMais = 10;
            atribuiMais +=3;//Soma pelo valor já existente
        int atribuiMenos = 5;
            atribuiMenos -= 1;//Subtrai pelo valor já existente
        int atribuiMultiplica = 5;
            atribuiMultiplica *=5;//Multiplica pelo valor já existente
        int atribuiDivide =50;
            atribuiDivide /=10;//Divide pelo valor já existente
        int atribuiResto = 95;
            atribuiResto %=13;//Divide e atribui o resto
        
        System.out.println("\n(=): "+atribui+"\n(+=): "+atribuiMais+"\n(-=): "+atribuiMenos+"\n(*=): "+atribuiMultiplica+"\n(/=): "+atribuiDivide+"\n(%=): "+atribuiResto+"");
    
        /*
        int X = 10
            X += 20
        X = 20
        */

        System.out.println("\n\nOperadores Relacionais:\nEles servem para comparar o valor de uma variável e devolve com true ou false; \nExistem 6 deles: \nComparação(==);\nDiferente de (!=);\nMaior que(>);\nMenor que(<);\nMaior ou igual(>=);\nMenor ou igual(<=);");

        int ExCondi1 = 5;
        int ExCondi2 = 10;

        //demonstração
        System.out.println(ExCondi1+"-- "+ExCondi2);
        if (ExCondi1==ExCondi2) {
            System.out.println("È IGUAl");
        }
        else if(ExCondi1>ExCondi2)
            {
            System.out.println("È MAIOR");
        }
         else if(ExCondi1<ExCondi2)
            {
            System.out.println("È MENOR");
        }
         else if(ExCondi1>ExCondi2)
            {
            System.out.println("È MAIOR");
        }
        else{
            System.out.println("È DIFERENTE");
        }

        System.out.println("\nOperadores lógicos:Eles são usados em estruturas de condição verificam os valores e devolvem true or false dependendo de todos.\nExistem 3 deles:\n&&(and)\n||(or)\n!(not)\n&& retorna true se ambas forem true\n|| retorna true se pelo menos uma for true\n! inverte o valor(true <-> false).");

        boolean logico1 = true;
        boolean logico2 = false;
        boolean logico3 = false;
        boolean logico4= true;

        if(logico1 && logico2){
            System.out.println(logico1);
        }
        else{
            System.out.println(logico2);
        }
        if(logico1 || logico3){
            System.out.println(logico1);
        }
        else{
            System.out.println(logico3);
        }
        if (!logico2){
            System.out.println(logico2);
        }
        else{
            System.err.println(logico2);
        }
        //pode ser usado com outros tipos tb
        /*int eba = 20
        boolean ola = true

        if (eba>=10 && ola){
        se for true}
         */
    }
}
