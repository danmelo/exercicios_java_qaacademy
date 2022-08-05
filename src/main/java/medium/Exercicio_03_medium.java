package medium;

public class Exercicio_03_medium {

    static int i, soma;

    public static void main(String[] args) {

        for(i=0; i<=1000; i++){
            soma = soma+i;

            if (soma >= 1500) {
                System.out.println("O valor total da soma é " + soma);
                break;
            }

        }

    }

}
