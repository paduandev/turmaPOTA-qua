package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Aristoteles
 */
public class Aristoteles {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroLamp;
        ArrayList<Boolean> lampadas;

        System.out.println("Quantas lampadas?");
        numeroLamp = entrada.nextInt();

        // cria o vetor depois que souber quantas lampadas serão usadas
        lampadas = new ArrayList<>(numeroLamp);

        // inicializa todas as lampadas apagadas
        for (int i = 0; i < lampadas.size(); i++) {
            lampadas.add(false);
        }

        //simulando as caminhadas
        for (int caminhada = 1; caminhada <= lampadas.size(); caminhada++) {
            for (int lampada = 1; lampada <= lampadas.size(); lampada++) {
                if(lampada % caminhada == 0) { // verifica se é divisível
                    lampadas.set(lampada-1, !lampadas.get(lampada-1)); // troca o estado da lampada (apagado <-> aceso)
                }
            }
        }

        // exibe os estados das lampadas
        for (int i = 0; i < lampadas.size(); i++) {
            System.out.print(lampadas.get(i) + " ");
        }

        entrada.close();
    }

}