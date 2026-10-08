public class Raquete {
    private int loc_x, loc_y, altura_raquete, largura_raquete;
    private double velocidade_raquete;

    public Raquete(int xInicial, int yInicial) { // Definindo a estrutura do objeto Raquete
        this.loc_x = xInicial;
        this.loc_y = yInicial;

        this.altura_raquete = 80;
        this.largura_raquete = 7;

        this.velocidade_raquete = 5.0;
    }

    // Criei esses métodos publicos para "encapsular" as acoes da Raquete
    public int getX() {
        return this.loc_x;
    }

    public int getY() {
        return this.loc_y;
    }

    public int getAltura() {
        return this.altura_raquete;
    }

    public int getLargura() {
        return this.largura_raquete;
    }


}
