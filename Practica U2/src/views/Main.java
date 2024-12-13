package views;

import java.util.Scanner;

import Controller.Ejercicios.Llamadas_Internacionales;
import Controller.Ejercicios.Serie;
import Controller.Ejercicios.Sueldo;
import Controller.Ejercicios.Valor_cosumoagua;
import Controller.Preguntas_ensayo.Hacer_Mientras;
import Controller.Preguntas_ensayo.Mientras;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int salida = 0;
        do {
            System.out.println("--------------------Menu-------------------");
            System.out.println("Escoja el progrma que desea correr");
            System.out.println("1 Monto total a pagar a fin de mes");
            System.out.println("2 Valor a pagar por llamdas internacionales");
            System.out.println("3 Consumo de agua");
            System.out.println("4 Serie");
            System.out.println("5 Mientra Contador");
            System.out.println("6 Saber el decuento");
            System.out.println("0 salir del sistema");
            salida = sc.nextInt();
            switch (salida) {
                case 0:
                    break;
                case 1:
                    Sueldo Informe_Empleado = new Sueldo();
                    Informe_Empleado.Sueldo_ejecutar();
                    break;
                case 2:
                    Llamadas_Internacionales LL_I = new Llamadas_Internacionales();
                    LL_I.ejecutar();
                    break;
                case 3:
                    Valor_cosumoagua V_consumo = new Valor_cosumoagua();
                    V_consumo.pago_agua();

                    break;
                case 4:
                    Serie S = new Serie();
                    S.ejecutar_serie();
                    break;
                case 5:
                    Mientras M = new Mientras();
                    M.Mientras_codicional();
                    break;
                case 6: 
                    Hacer_Mientras H_M = new Hacer_Mientras();
                    H_M.descuento_edad();
                    break;
                default:
                    salida = 0;
                    break;
            }
        } while (salida != 0);
    }
}
