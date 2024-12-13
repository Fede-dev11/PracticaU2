//Desarrolle un ejemplo de la estructura condicional MIENTRAS con CONTADORES en Pseudo-código y en lenguaje de programación java? 
package Controller.Preguntas_ensayo;

import java.util.Scanner;

public class Mientras {
    public void Mientras_codicional() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Un numero: ");
        int inicio = sc.nextInt();

        System.out.println("Ingrese Un numero: ");
        int fin = sc.nextInt();

        int contadorNegativos =0;
        int contadorPositivos = 0;
        int contador = inicio;

                while (contador <= fin) {
                    if (contador < 0) { 
                        contadorNegativos++;
                    } else if (contador > 0) { 
                        contadorPositivos++;
                    }
                    contador++;  
                }
                System.out.println("Cantidad de números negativos entre "+inicio+ " y " +fin+ " hay: " + contadorNegativos);
                System.out.println("Cantidad de números positivos entre "+inicio+ " y " +fin+ " hay: " + contadorPositivos);

        }
        //Fernando Patiño
    }

