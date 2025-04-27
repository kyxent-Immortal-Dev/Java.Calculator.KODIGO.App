public class RaizCuadrada {
    private double num1;

    /**
     * Constructor para la clase RaizCuadrada
     * @param num1 Número del que se calculará la raíz cuadrada
     */
    public RaizCuadrada(double num1) {
        this.num1 = num1;
    }

    /**
     * Calcula la raíz cuadrada del número
     * @return Resultado de la raíz cuadrada
     * @throws ArithmeticException Si se intenta calcular la raíz de un número negativo
     */
    public double calcular() {
        if (num1 < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(num1);
    }
}