package medium;

public class Exercicio_04_medium {

    static int i=1, multiplicacao=1, controle=0;

    public static void main(String[] args) {

        while(i<=1000){
            controle = multiplicacao;
            System.out.println("O valor a ser multiplicado é " + controle + " x " + i);
            multiplicacao = multiplicacao * i;

            if (multiplicacao >= 1000) {
                System.out.println("O resultado da multiplicação " + controle + " x " + i + " = " + multiplicacao );
                multiplicacao = 1;
            }

            i++;

        }

    }

}
