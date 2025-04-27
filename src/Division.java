public class Division {
    private double num1;
    private double num2;

    /**
     * Constructor para la clase Division
     * @param num1 Dividendo
     * @param num2 Divisor
     */
    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Realiza la división de los dos números
     * @return Resultado de la división
     * @throws ArithmeticException Si se intenta dividir por cero
     */
    public double dividir() {
        if (num2 == 0) {
            throw new ArithmeticException("No es posible dividir por cero");
        }
        return num1 / num2;
    }
}