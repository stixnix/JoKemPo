/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo.Controller;
    
import java.util.Random;

public class Jogo {
    public  int gerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static String determinarResultado(int escolhaJogador, int escolhaComputador) {
        if (escolhaJogador == escolhaComputador) {
            return "Empate";
        } else if ((escolhaJogador == 1 && escolhaComputador == 3) ||
                   (escolhaJogador == 2 && escolhaComputador == 1) ||
                   (escolhaJogador == 3 && escolhaComputador == 2)) {
            return "Você venceu!";
        } else {
            return "Computador venceu!";
        }
    }
}
 

