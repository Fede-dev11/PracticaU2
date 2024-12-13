/*3.	La empresa municipal de agua potable de Loja desea cobrar y calcular mensualmente el valor exacto de 
consumo del agua potable de cada medidor que pertenece a un contribuyente, de acuerdo a la ordenanza vigente, 
la cual establece la planilla de acuerdo a los siguientes rubros:
A) SERVICIO DE AGUA POTABLE: Para obtener el rubro ríjase a la siguiente tabla:
 */
package Controller.Ejercicios;

import java.util.Scanner;

public class Valor_cosumoagua {
    public void pago_agua() {
        Scanner v_agua = new Scanner(System.in);
        System.out.print("Ingresa el consumo de agua en m³: ");
        double consumo_agua = v_agua.nextDouble();
        
        System.out.print("Ingrese su edad: ");
        double terceraEdad = v_agua.nextDouble();

        System.out.print("¿Tiene algún tipo de discapacidad? ");
        System.out.println("Ingrese 1 SI o 0 NO");
        int discapacidad = v_agua.nextInt();

        double porcentajeDiscapacidad = 0;
        if (discapacidad == 1) {
            System.out.print("Ingresa el porcentaje de discapacidad (0 a 100): ");
            porcentajeDiscapacidad = v_agua.nextDouble();
        }

        double precio_consumo = 0.0;
        if (consumo_agua <= 15) {
            precio_consumo = 3.0;

        } else if (consumo_agua <= 25) {
            precio_consumo = 3.0 + (consumo_agua - 15) * 0.10;

        } else if (consumo_agua <= 40) {
            precio_consumo = 3.0 + (10) * 0.10 + (15) * 0.20;

        } else if (consumo_agua <= 60) {

            precio_consumo = 3.0 + (10) * 0.10 + (15) * 0.20 + (consumo_agua - 40) * 0.30;

        } else {
            precio_consumo = 3.0 + (10) * 0.10 + (15) * 0.20 + (20) * 0.30 + (consumo_agua - 60) * 0.35;

        }
        if (terceraEdad >= 65) {
            // Aplicar descuentos
            if (consumo_agua <= 15) {
                precio_consumo *= 0.50; // 50% de descuento para tercera edad en el rango base
            } else if(terceraEdad >= 65) {
                precio_consumo -= 3.00 * 0.30; // 30% de descuento en el rango base
            }
        }

        if (discapacidad <= 100) {
            precio_consumo -= 3.00 * (porcentajeDiscapacidad / 100.0); // Descuento por discapacidad
        }

        // Cálculo de impuestos y tasas
        double impuestoAlcantarillado = precio_consumo * 0.35;
        double tasaRecoleccionBasura = 0.75;
        double tasaProcesamientoDatos = 0.50;

        // Total a pagar
        double total = precio_consumo + impuestoAlcantarillado + tasaRecoleccionBasura + tasaProcesamientoDatos;

        // Mostrar resultados
        System.out.println("El consumo de" + consumo_agua + " m³ de agua tiene un valor: " + precio_consumo);
        System.out.printf("Impuesto de alcantarillado (35%%): $%.2f%n", impuestoAlcantarillado);
        System.out.printf("Tasa por recolección de basura: $%.2f%n", tasaRecoleccionBasura);
        System.out.printf("Tasa por procesamiento de datos: $%.2f%n", tasaProcesamientoDatos);
        System.out.printf("Total a pagar: $%.2f%n", total);

    }
}
