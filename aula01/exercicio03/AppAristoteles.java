package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppAristoteles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroLamp;
        ArrayList<Lampada> lampadas;

        System.out.println("Quantas lampadas?");
        numeroLamp = entrada.nextInt();

        lampadas = new ArrayList<>();

        // inicializa todas as lampadas apagadas
        for (int i = 0; i < numeroLamp; i++) {
            lampadas.add(new Lampada());
        }

        //simulando as caminhadas
        for (int caminhada = 1; caminhada <= lampadas.size(); caminhada++) {
            for (int lampada = 1; lampada <= lampadas.size(); lampada++) {
                if(lampada % caminhada == 0) { // verifica se é divisível
                    lampadas.get(lampada-1).acionarInterruptor(); // troca o estado da lampada (apagado <-> aceso)
                }
            }
        }

        // exibe os estados das lampadas
        for (int i = 0; i < lampadas.size(); i++) {
            System.out.print(lampadas.get(i).exibir() + " ");
        }

        entrada.close();
    }

}
