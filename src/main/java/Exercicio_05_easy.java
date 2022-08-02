import javax.swing.*;

public class Exercicio_05_easy {

    static int valorInformado1, valorInformado2, valorInformado3, soma, subtracao, multiplicacao, divisaoMedia;

    public static void main(String[] args) {

        valorInformado1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
        valorInformado2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
        valorInformado3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor:"));

        soma = valorInformado1+(valorInformado2 + valorInformado3);
        subtracao = (valorInformado3 - valorInformado2) - valorInformado1;
        multiplicacao = valorInformado1 * (valorInformado2*valorInformado3);
        divisaoMedia = soma / 3;

        System.out.print("A soma dos números é: " + soma + "\n" + "A multiplicacao dos numeros é: " + multiplicacao + "\n" +
                "A subtracao dos numeros é: " + subtracao + "\n" + "A media dos numeros é: " + divisaoMedia );

    }
    //Faça um algoritmo para ler três números inteiros, armazenar em variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados.
    //
    //Inicio do Algoritmo
    //
    //Declarar variável do tipo inteiro: valorInformado1, valorInformado2, valorInformado3; soma; subtracao, multiplicacao, divisaoMedia;
    //valorInformado1= Ler (5);
    //valorInformado2= Ler (3);
    //valorInformado3= Ler (8);
    //
    //soma = valorInformado1 + (valorInformado2 + valorInformado3);
    //subtracao = (valorInformado3 – valorInformado2) – valorInformado1;
    //multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
    //divisaoMedia = soma / 3;
    //
    //Exibir: “Valores: ” + soma + subtração + multiplicacao + divisaoMedia;
    //
    //˜Valores : 16, 0, 120, 5˜
    //Fim do Algoritmo
}
