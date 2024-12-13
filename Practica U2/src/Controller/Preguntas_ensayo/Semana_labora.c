#include <stdio.h>

enum semana_labora {LUNES = 1, MARTES = 2, MIERCOLES = 3, JUEVES = 4, VIERNES = 5};

int main() {
    int dia = 1;
    printf("Ingrese un numero del 1 al 5: ");
    scanf("%d", &dia);
    for (int i = LUNES; i <= VIERNES; i++) {
        printf("El día de la semana es: %d\n", i);

        if ((i % 2) != 0) {
            printf("Hoy es un gran día para Teoría de la Programación\n");
        }
        if (dia == i) {
            break;
        }
    }//Fernando patiño
}
