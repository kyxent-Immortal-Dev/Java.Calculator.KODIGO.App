public class Resta {
    private double num1;
    private double num2;

    /**
     * Constructor para la clase Resta
     * @param num1 Número del que se resta
     * @param num2 Número que se resta
     */
    public Resta(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Realiza la resta de los dos números
     * @return Resultado de la resta
     */
    public double restar() {
        return this.num1 - this.num2;
    }
}