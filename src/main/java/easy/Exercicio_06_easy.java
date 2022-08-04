import javax.swing.*;

public class Exercicio_06_easy { //Inicio do algoritmo

    // Faça um algoritmo para ler duas notas, calcular a média.
    //E SE - a média > 5 Exibir aprovado;
    //SE a média < que 5 exibir reprovado;
    //Se media = 5 exibir exame.

    //Declarar variável do tipo inteiro: primeiraNota, segundaNota, mediaNotas;
    static double primeiraNota, segundaNota, mediaNotas;

    public static void main(String[] args) {

        //primeiraNota = Ler(4);
        primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota:"));
        //segundaNota = Ler(5);
        segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota:"));
        //mediaNotas = (primeiraNota+segundaNota) / 2;
        mediaNotas = (primeiraNota + segundaNota)/2;

        //SE (mediaNotas > 5)
        //Ler: "Aprovado!";
        //FIM SE
        if (mediaNotas>5){
            System.out.println("APROVADO: " + "média " + mediaNotas);
        }

        //SE (mediaNotas < 5)
        //Ler: "Reprovado!";
        //FIM SE
        else if (mediaNotas<5){
            System.out.println("REPROVADO: " + "média " + mediaNotas);
        }

        //SE NÃO (mediaNotas = 5)
        //Ler: "Ficou para exame!";
        else if(mediaNotas==5){
            System.out.println("EXAME: " + "média " + mediaNotas);
        }


    }

}//Fim do algoritmo
