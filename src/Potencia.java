public class Potencia {
    private double num1;
    private double num2;

    /**
     * Constructor para la clase Potencia
     * @param num1 Base
     * @param num2 Exponente
     */
    public Potencia(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Calcula la potencia (num1 elevado a num2)
     * @return Resultado de la potencia
     */
    public double potenciar() {
        return Math.pow(num1, num2);
    }
}