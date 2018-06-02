package controlador.productoBuilder;

public class Producto {
    private int cafe;
    private int leche;
    private int azucar;
    private int chocolate;
    private int agua;

    public void sinAzucar(){
        azucar = 0;
    }

    @Override
    public String toString() {
        return  "Cafe: " + cafe + "\n" +
                "Leche: " + leche + "\n" +
                "Agua: " + agua + "\n" +
                "Chocolate: " + chocolate + "\n" +
                "Azucar: " + azucar ;
    }

    /**
     * Getter de cafe
     * @return cafe
     */
    public int getCafe() {
        return cafe;
    }

    /**
     * Getter de leche
     * @return leche
     */
    public int getLeche() {
        return leche;
    }

    /**
     * Getter de azucar
     * @return azucar
     */
    public int getAzucar() {
        return azucar;
    }

    /**
     * Getter de chocolate
     * @return chocolate
     */
    public int getChocolate() {
        return chocolate;
    }

    /**
     * Getter de agua
     * @return agua
     */
    public int getAgua() {
        return agua;
    }

    /**
     * Setter de cafe
     * @param cafe del tipo int
     */
    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    /**
     * Setter de leche
     * @param leche del tipo int
     */
    public void setLeche(int leche) {
        this.leche = leche;
    }

    /**
     * Setter de azucar
     * @param azucar del tipo int
     */
    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    /**
     * Setter de chocolate
     * @param chocolate del tipo int
     */
    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }

    /**
     * Setter de agua
     * @param agua del tipo int
     */
    public void setAgua(int agua) {
        this.agua = agua;
    }
}
