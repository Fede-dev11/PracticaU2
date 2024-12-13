/*1.	Una compañía de autos usados paga $2,500.00 de sueldo a sus empleados por mes, 
Además agrega pagos extras a sus sueldos como: una comisión de $250.00 por cada automóvil vendido 
cuyo valor de venta supere el $10,000.00 y el 5% de utilidad del valor total de ventas.  
La compañía necesita emitir un informe desglosado por empleado donde indique el número total de autos vendidos,
 el valor total de los autos que vendió, el monto total que se le debería pagar al final del mes, indicando: el sueldo mensual, 
 la comisión por cada automóvil y la utilidad por el valor total de la venta. También debe permitir ingresar la venta de los automóviles 
 hasta que se desee y luego emitir el respectivo informe.   */
 package Controller.Ejercicios;

import java.util.Scanner;

import Controller.Util.Utilidades;

public class Sueldo {
    public void Sueldo_ejecutar() {

        Scanner sc = new Scanner(System.in);
        int autos_vendidos = 0;
        double sueldobase = 0;
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        while (true) {
            System.out.println("Ingrese el sueldo base del empleado: ");
            String sueldobase1 = sc.nextLine();
            if (Utilidades.validate(sueldobase1)) {
                sueldobase = Utilidades.transformStringDouble(sueldobase1);
                break;
            } else {
                System.out.println("Entrada inválida. Ingrese un número válido para el sueldo base.");
            }
        }
        while (true) {
            System.out.println("Ingrese el número total de autos vendidos: ");
            String autosVendidos1 = sc.nextLine();
            if (Utilidades.validate(autosVendidos1)) {
                autos_vendidos = Utilidades.transformStringInt(autosVendidos1);
                break;
            } else {
                System.out.println("Entrada inválida. Ingrese un número válido para el número de autos vendidos.");
            }
        }

        double comisionAuto = 0.0; 
        double ventasMes = 0.0; 

        for (int i = 1; i <= autos_vendidos; i++) {
            double valorAuto = 0;
            while (true) {
                System.out.print("Valor del auto " + i + ": ");
                String valorAutoInput = sc.nextLine();
                if (Utilidades.validate(valorAutoInput)) {
                    valorAuto = Utilidades.transformStringDouble(valorAutoInput);
                    break;
                } else {
                    System.out.println("Entrada inválida. Ingrese un valor válido para el auto.");
                }
            }

            ventasMes += valorAuto;

            if (valorAuto > 10000) {
                comisionAuto += 250; 
            } 
        }

        double sueldoTotal = sueldobase + comisionAuto;

        System.out.println("\n--- Informe del sueldo del empleado ---");
        System.out.println("Cantidad de autos vendidos: " + autos_vendidos);
        System.out.println("Comisión Total por autos vendidos: " + comisionAuto);
        System.out.println("El sueldo total a pagar al empleado " + nombre + " es de: " + sueldoTotal);
    }
}
