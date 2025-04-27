public class Suma {
    private double num1;
    private double num2;

    /**
     * Constructor para la clase Suma
     * @param num1 Primer número a sumar
     * @param num2 Segundo número a sumar
     */
    public Suma(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Realiza la suma de los dos números
     * @return Resultado de la suma
     */
    public double sumar() {
        return this.num1 + this.num2;
    }
}