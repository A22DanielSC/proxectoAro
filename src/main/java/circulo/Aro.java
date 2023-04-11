package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 *
 * @author Daniel Sebio
 */
public class Aro {

    /**
     * Constante mínimo
     */
    public static final double MINIMO = 0.0;

    /**
     * Constante limiteradio
     */
    public static final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor de objeto Aro
     */
    public Aro() {
    }

    /**
     * Constructor de Aro
     * @param valorX valor de la coordenada X del objeto Aro
     * @param valorY valor de la coordenada Y del objeto Aro
     * @param valorRadio valor del radio del objeto Aro (Calculo en método setRadio)
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Método para obtener el diámetro del objeto Aro
     * @return devuelve el valor de diametro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * Método para obtener circunferencia del objeto Aro
     * @return devuelve el valor de la circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Método para obtener superficie del objeto Aro
     * @return devuelve el valor de la superficie
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    /**
     * Método para recibir los datos de las variables del objeto Aro
     * @return devuelve el valor de todos los datos de las variables Aro en string
     */
    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * Método para trasladar el centro del objeto Aro
     * @param trasladarX cantidad que se va a desplazar X
     * @param trasladarY cantidad que se va a desplazar Y
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        coordenadaX = coordenadaX + trasladarX;
        coordenadaY = coordenadaY + trasladarY;
    }

    /**
     * Getter variable coordenadaX
     * @return devuelve coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Getter variable coordenadaY
     * @return devuelve coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Getter variable radio
     * @return devuelve radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Setter variable coordenadaX
     * @param coordenadaX asigna el valor a la coordenadaX
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Setter variable coordenadaY
     * @param coordenadaY asigna el valor a la coordenadaY
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Setter variable radio
     * @param radio asigna el valor a radio
     */
    public void setRadio(double radio) {
        this.radio = (radio < MINIMO ? MINIMO : radio);
    }

}
