package calculadora;

public class calculadora {

    private int operando1;
    private int operando2;

    public calculadora() {

    }

    public calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int sumar() {
        int suma = this.operando1 + this.operando2;
        return suma;
    }

    public int restar() {
        int resta = this.operando1 - this.operando2;
        return resta;
    }

    public int multiplicar() {
        int multipplicación = this.operando1 * this.operando2;
        return multipplicación;
    }

    public double dividir() {
        double división = (double)this.operando1 / (double)this.operando2;
        return división;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
