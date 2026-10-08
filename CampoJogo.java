import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public class CampoJogo extends JPanel {
    public static final int LARGURA = 800; // Alinhado com o roteiro[cite: 11]
    public static final int ALTURA = 600;

    private Raquete raqueteplayer; // Instanciacao da raquete, esta sendo aqui porque ela vai ser acessada por outros parametros em seguida.
    private Raquete raquetecpu;

    public CampoJogo() {
        this.setPreferredSize(new Dimension(LARGURA, ALTURA));
        this.setBackground(Color.BLACK);

        this.raqueteplayer = new Raquete(20, (ALTURA / 2) - 50);
        this.raquetecpu = new Raquete(LARGURA - 40, (ALTURA / 2) - 50);
    }

    @Override // Esse metodo override serve para avisar para o compilador que estou usando um método que já existe na classe mãe (JPanel)
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        
        g.drawLine(400, 0, 400, 600);
        
        g.fillRect(raqueteplayer.getX(), raqueteplayer.getY(), raqueteplayer.getLargura(), raqueteplayer.getAltura());
        g.fillRect(raquetecpu.getX(), raqueteplayer.getY(), raqueteplayer.getLargura(), raqueteplayer.getAltura());
    }
}