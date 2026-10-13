import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class CampoJogo extends JPanel {
  public static final int LARGURA = 800; // Alinhado com o roteiro[cite: 11]
  public static final int ALTURA = 600;

  private Raquete raqueteplayer; // Instanciacao da raquete, esta sendo aqui porque ela vai ser acessada por
                                 // outros parametros em seguida.
  private Raquete raquetecpu;

  private boolean subindo;
  private boolean descendo;

  public CampoJogo() {

    this.setPreferredSize(new Dimension(LARGURA, ALTURA));
    this.setBackground(Color.BLACK);
    this.raqueteplayer = new Raquete(20, (ALTURA / 2) - 50);
    this.raquetecpu = new Raquete(LARGURA - 40, (ALTURA / 2) - 50);

    // LENDO MOVIMENTOS DO W
    this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "pressionar_w");
    this.getActionMap().put("pressionar_w", new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        subindo = true;
        System.out.println("W Pressionado");
      }
    });
    this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released W"), "soltar_w");
    this.getActionMap().put("soltar_w", new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        subindo = false;
        System.out.println("W Solto !");
      }
    });

    // LENDO MOVIMENTOS DO S
    this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "pressionar_s");
    this.getActionMap().put("pressionar_s", new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        subindo = true;
        System.out.println("S Pressionado");
      }
    });
    this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released S"), "soltar_s");
    this.getActionMap().put("soltar_s", new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {
        subindo = false;
        System.out.println("S Solto !");
      }
    });
  }

  @Override // Esse metodo override serve para avisar para o compilador que estou usando um
            // método que já existe na classe mãe (JPanel)
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.WHITE);

    g.drawLine(400, 0, 400, 600);

    g.fillRect(raqueteplayer.getX(), raqueteplayer.getY(), raqueteplayer.getLargura(), raqueteplayer.getAltura());
    g.fillRect(raquetecpu.getX(), raqueteplayer.getY(), raqueteplayer.getLargura(), raqueteplayer.getAltura());
  }
}
