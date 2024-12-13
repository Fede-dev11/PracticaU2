/*El costo de las llamadas telefónicas internacionales depende de la zona geográfica en la que se encuentre el país destino 
y del número de minutos hablados. En la siguiente tabla se presenta el costo del minuto por hora. Cada zona se le ha asociado 
con una clave (Use tipos de datos ENUMERADOS PARA LA ZONA).
 */
package Controller.Ejercicios;

import java.util.Scanner;

public class Llamadas_Internacionales {
    public enum ZonaSeleccionada {
        AMERICA_NORTE(2.75f), AMERICA_CENTRAL(1.89f), AMERICA_SUR(1.60f),
        EUROPA(3.50f), ASIA(4.50f), AFRICA(3.15f), OCEANIA(3.00f), RESTO_DEL_MUNDO(6.00f);

        private float costoPorMinuto;

        private ZonaSeleccionada(float value) {
            costoPorMinuto = value;
        }

        public float getCostoPorMinuto() {
            return costoPorMinuto;
        }
    }

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zonas disponibles:");
        System.out.println("12 - América del Norte");
        System.out.println("15 - América Central");
        System.out.println("18 - América del Sur");
        System.out.println("19 - Europa");
        System.out.println("23 - Asia");
        System.out.println("25 - África");
        System.out.println("29 - Oceanía");
        System.out.println("31 - Resto del Mundo");
        System.out.println("\nIngrese la clave para la zona a la que desea realizar la llamada:");

        int clave = sc.nextInt();
        ZonaSeleccionada zonaSeleccionada;

        switch (clave) {
            case 12:
                zonaSeleccionada = ZonaSeleccionada.AMERICA_NORTE;
                break;
            case 15:
                zonaSeleccionada = ZonaSeleccionada.AMERICA_CENTRAL;
                break;
            case 18:
                zonaSeleccionada = ZonaSeleccionada.AMERICA_SUR;
                break;
            case 19:
                zonaSeleccionada = ZonaSeleccionada.EUROPA;
                break;
            case 23:
                zonaSeleccionada = ZonaSeleccionada.ASIA;
                break;
            case 25:
                zonaSeleccionada = ZonaSeleccionada.AFRICA;
                break;
            case 29:
                zonaSeleccionada = ZonaSeleccionada.OCEANIA;
                break;
            case 31:
                zonaSeleccionada = ZonaSeleccionada.RESTO_DEL_MUNDO;
                break;
            default:
                System.out.println("La clave ingresada no existe. Por favor, intente de nuevo.");
                return;
        }

        System.out.println("** Zona seleccionada: " + zonaSeleccionada + " **");
        System.out.println("El costo de la llamada es de " + zonaSeleccionada.getCostoPorMinuto() + "$ por minuto.");

        System.out.println("Ingrese la cantidad de minutos hablados:");
        float minutos = sc.nextFloat();

        float valorTotal = minutos * zonaSeleccionada.getCostoPorMinuto();
        System.out.println("El costo total es de:" + valorTotal + "$ por " + minutos + " min.");
    }
}
