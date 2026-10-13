/*
  DUVIDAS:
  - [] Entender Funcao anonima
  - 
*/

import javax.swing.SwingUtilities;

public class Main {
  public static void main(String[] args) {
    System.out.println("----- Iniciando PONG GAME ------------");

    SwingUtilities.invokeLater(() -> { // Funcao que ajuda no gerenciamento de memoria da aplicacao
      new JanelaJogo();
    });
  }
}
