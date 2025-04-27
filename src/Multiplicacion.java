public class Multiplicacion {
    private double num1;
    private double num2;

    /**
     * Constructor para la clase Multiplicacion
     * @param num1 Primer factor
     * @param num2 Segundo factor
     */
    public Multiplicacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Realiza la multiplicación de los dos números
     * @return Resultado de la multiplicación
     */
    public double multiplicar() {
        return num1 * num2;
    }
}