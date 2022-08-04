import javax.swing.*;

public class Exercicio_04_easy {
    static int numeroDigitado, resultado; //	Declarar variáveis do tipo inteiro

    public static void main(String[] args) {//Inicio Algoritmo


        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero")); //	numeroDigitado = Ler
        resultado = numeroDigitado*2; //	resultado = numeroDigitado * 2;
        System.out.println("O dobro do valor digitado é: " + resultado);  //	Exibir


    }
}//Fim Algoritmo
