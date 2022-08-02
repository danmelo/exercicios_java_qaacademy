import javax.swing.*;

//9-)Faça um algoritmo para ler um número inteiro entre: 1 e 10,
// calcular e exibir a tabuada deste número digitado.
// Ex.: 10 x 1 = 10, .., 10 x 10 = 100.
//
//Inicio Algoritmo
//
//	Declarar variaveis do tipo inteiro: numeroDigitado, i=1, resultado;
//	numeroDigitado = Ler (10);
//
//	Enquanto (i <= 10)
//		resultado = numeroDigitado * i;
//		Exibir : numeroDigitado + "x" + i + "=" + resultado;
//		i = i+1 // i++
//	Fim enquanto
//
//Exibição ao usuário: 10 x 3 = 30
//
//Fim Algoritmo
public class Exercicio_09_easy {

    static int numeroDigitado, i=1, resultado;

    public static void main(String[] args) {

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0 a 10:"));


                while (i <= 10) {
                    resultado = numeroDigitado * i;
                    System.out.println(numeroDigitado + " x " + i + " = " + resultado);
                    i++;
                }






    }

}
//testelll