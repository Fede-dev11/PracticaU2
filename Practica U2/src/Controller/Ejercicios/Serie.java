package Controller.Ejercicios;

import java.util.Scanner;

import Controller.Util.Utilidades;

public class Serie {
    private int generar_impar(int numero) {
        int resultado = 1;
        if (numero > 1) {
            for (int i = 1; i < numero; i++) {
                resultado += 2;
            }
        }
        return resultado;
    }

    private int generar_fibonacci(int numero) {
        if (numero == 1 || numero == 2) {
            return 1; // Los dos primeros números de Fibonacci son 1
        }
        int a = 1, b = 1, c = 0;
        for (int i = 3; i <= numero; i++) {
            c = a + b; // Suma de los dos anteriores
            a = b;
            b = c;
        }
        return c;
    }

    private int generar_numero(int numero) {
        return numero * 2; // Múltiplo de 2
    }

    public String ejecutar(int num_serie) {
        String serie = "S = ";
        if (num_serie > 0) {
            double suma = 0.0;

            for (int i = 1; i <= num_serie; i++) {
                int fibonacci = generar_fibonacci(i); 
                int impar = generar_impar(i); 
                int mult2 = generar_numero(i); 

                int signocambio= (i - 1) % 5; 
                int signo = 1; 

                if (signocambio== 0 || signocambio== 3 || signocambio== 4) {
                    signo = 1; 
                } else {
                    signo = -1; 
                }

                double termino = Math.pow((double) fibonacci / impar, mult2) * signo;

                if (signo == 1) {
                    serie += "(" + fibonacci + "/" + impar + ")^" + mult2 + " + ";
                } else {
                    serie += "(" + fibonacci + "/" + impar + ")^" + mult2 + " - ";
                }

                suma += termino;
            }

            if (serie.endsWith(" + ")) {
                serie = serie.substring(0, serie.length() - 3);
            } else if (serie.endsWith(" - ")) {
                serie = serie.substring(0, serie.length() - 3);
            }

            String resp = "La serie es:\n";
            resp += serie + "\n";
            resp += "El resultado es: " + suma;
            return resp;
        } else {
            return "Ingrese un número mayor a 0";
        }
    }

    public void ejecutar_serie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de términos de la serie:");
        String numero = sc.nextLine();
        int num_serie = Utilidades.transformStringInt(numero);
        System.out.println(ejecutar(num_serie));
    }
}
