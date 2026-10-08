import javax.swing.JFrame;

public class JanelaJogo extends JFrame {

    public JanelaJogo() {
        setTitle("Pong Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CampoJogo painel = new CampoJogo();
        this.add(painel);

        this.pack();
        // this.setSize(800, 600); // Controle do tamanho da janela
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}