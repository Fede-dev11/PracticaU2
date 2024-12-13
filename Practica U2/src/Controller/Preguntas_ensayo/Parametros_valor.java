package Controller.Preguntas_ensayo;

public class Parametros_valor {
    public static void modificarValor(int numero) {
        numero = 10; 
    }

    public static void main(String[] args) {
        int valor = 5;
        
        System.out.println("Valor antes de llamar a la función: " + valor);

        modificarValor(valor);
 
        System.out.println("Valor después de llamar a la función: " + valor);
    }
}
