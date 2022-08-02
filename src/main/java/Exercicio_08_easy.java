//8-) Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do salário bruto,
// valor do salário líquido e o valor do imposto de renda.

import javax.swing.*;

public class Exercicio_08_easy {

    static double salario, salarioLiquido, impostoRenda;

    public static void main(String[] args) {
    //Inicio Algoritmo
        //	Declarar variaveis do tipo numero: salario, salarioLiquido, impostoRenda;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário:"));//salario = Ler (2500,00);
        //
        if(salario>=0 && salario <= 1903.98) {//SE (salario >= 0 && <= 1.903,98)
            impostoRenda = 0;//impostoRenda = 0;
            salarioLiquido = salario - impostoRenda;//salarioLiquido = salario - impostoRenda;
        }//FIM SE
        //
        else if(salario >= 1903.99 && salario <= 2826.65) { //SE (salario >= 1.903,99 && <= 2.826,65)
            impostoRenda = (salario * 0.075) - 142.80;//impostoRenda = (salario * 0,075) - 142,80;
            salarioLiquido = salario - impostoRenda;//salarioLiquido = salario - impostoRenda;
        }//FIM SE
        //
        else if(salario >= 2826.66 && salario <= 3751.05) {//SE (salario >= 2.826,66 && <= 3.751,05)
            impostoRenda = (salario * 0.15) - 354.80;//impostoRenda = (salario * 0.15) - 354,80;
            salarioLiquido = salario - impostoRenda;//salarioLiquido = salario - impostoRenda;
        } //FIM SE
        //
        else if(salario >= 3751.06 && salario <=4664.68) {//SE (salario >= 3.751,06 && <= 4.664,68)
            impostoRenda = (salario * 0.225) - 636.13;//impostoRenda = (salario * 0.225) - 636,13
            salarioLiquido = salario - impostoRenda;//salarioLiquido = salario - impostoRenda;
        }//FIM SE
        //
        else if(salario >= 4664.69) {//SE NAO (salario >= 4.664,69)
            impostoRenda = (salario * 0.275) - 869.36;//	impostoRenda = (salario * 0,275) - 869,36
            salarioLiquido = salario - impostoRenda;//salarioLiquido = salario - impostoRenda;
        }//
        //
        System.out.println("Seu salario BRUTO sera: R$ " + salario);//Exibir: "Seu salario BRUTO sera: R$:" + salario;
        System.out.println("Seu salario LIQUIDO sera: R$ " + salarioLiquido);//Exibir: "Seu salario LIQUIDO sera: R$:" + salarioLiquido;
        System.out.println("O valor a ser pago de IR sera: R$ " + impostoRenda);//Exibir: "O valor a ser pago de IR sera: R$:" + impostoRenda;
        //

    }

}//Fim Algoritmo
