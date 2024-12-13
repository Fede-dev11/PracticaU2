#include <stdio.h>
//Fernando Patiño
int main() {
    char nombre[15];
    float calificaciones[5];  // Para almacenar las 5 calificaciones
    float promedio;
    float suma = 0.0;

    // Solicitar el nombre del estudiante
    printf("Ingrese el nombre del estudiante: ");
    scanf("%s", nombre);  

    // Solicitar las 5 calificaciones
    printf("Ingrese las 5 calificaciones del estudiante:\n");
    for (int i = 0; i < 5; i++) {
        printf("Calificación %d: ", i + 1);
        scanf("%f", &calificaciones[i]);
        suma += calificaciones[i];  
    }

    promedio = suma / 5;

    // Mostrar los resultados
    printf("\n--- Informe del Estudiante ---\n");
    printf("Nombre: %s\n", nombre);
    printf("Promedio de calificaciones: %.2f\n", promedio);

    return 0;
}
