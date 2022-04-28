package exercicios.java.dio;

public class CalculadoraDio {

    public static void soma(double numero1, double numero2){

        double resultados = numero1 + numero2;

        System.out.println("A soma de " + numero1  + " mais " + numero2 + " = " + resultados);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultados = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " = " + resultados );
    }

    public static void multiplicacao(double numero1, double numero2){

        double resultados = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " = " + resultados);

    }

    public static void divisao(double numero1, double numero2){

        double resultados = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " dividido por " + numero2 + " = " + resultados);
    }

}
