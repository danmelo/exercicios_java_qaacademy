import javax.swing.*;

public class Exercicio_07_easy {//Inicio do Algoritmo
    //7-) Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do INSS a ser pago.

    static double salario, inss;//Declarar variável do tipo numerico: salario, inss;

    public static void main(String[] args) {

        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu salário:"));//salario = Ler(7000,00)

        if (salario <= 1045){//SE (salario <= 1.045)
            inss = salario * 0.075;//inss  = salario * 0,075;
        } // FIM SE

        else if (salario >= 1045.01 && salario <= 2089.60){// SE (salario >= 1.045,01 && <= 2.089,60)
            inss = salario * 0.09;// inss = salario * 0,09;
        }// FIM SE

        else if (salario >= 2089.61 && salario <= 3134.40){// SE (salario >= 2.089,61 && <= 3.134,40)
           inss = salario * 0.12; // inss = salario * 0,12;
        }// FIM SE

        else if (salario >= 3134.41 && salario <= 6101.06){// SE (salario >= 3.134,41 && <= 6.101,06)
            inss = salario * 0.14;// inss = salario * 0,14;
        }// FIM SE

        else {//SE NAO
            inss = salario * 0.14;//inss = salario * 0,14;
        }


        System.out.println("O valor a ser pago de INSS é: " + inss);//Exibir: “ O valor a ser pago de INSS é” + inss

    }
}  //Fim do Algoritmo
