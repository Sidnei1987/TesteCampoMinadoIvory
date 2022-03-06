package com.ivory.TesteEstagio.CampoMinado;

import java.util.Random;

public class Program {
	
	
	public void executar() {

        CampoMinado campoMinado = new CampoMinado();
        StatusTipo status = StatusTipo.Aberto;

        System.out.println("Início do jogo\n=======");
        System.out.println(campoMinado.Tabuleiro());

        // Realize sua codificação a partir deste ponto, boa sorte! 
        
        Random random = new Random();

        while (campoMinado.JogoStatus() == status) {
            int linha = random.nextInt(9) + 1;
            int coluna = random.nextInt(9) + 1;
            campoMinado.Abrir(linha, coluna);
        }

        System.out.println("---------------- RESULTADO FINAL ------------------");
        System.out.println(campoMinado.Tabuleiro());
        System.out.println("---------------------------------------------------");
        System.out.println("Status do jogo: " + campoMinado.JogoStatus());
        System.out.println("---------------------------------------------------");
    }
	
}
	