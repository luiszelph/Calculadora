package calculadora;

public class proyectoCalculadora {

    public static void main(String[] args) {
        calculadora miCalculadora = new calculadora(10,2) ;

        int suma = miCalculadora.sumar();
        System.out.println("El resultado de la suma es: " + suma);

        int resta = miCalculadora.restar();
        System.out.println("El resultado de la resta es: " + resta);

        int multiplicación = miCalculadora.multiplicar();
        System.out.println("El resultado de la multiplicación es: " + multiplicación);

        double división = miCalculadora.dividir();
        System.out.println("El resultado de la división es: " + división);

    }

}
