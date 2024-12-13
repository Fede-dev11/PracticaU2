#include <stdio.h>

// Declaración de funciones
double calcularAreaRectangulo(double base, double altura);
double calcularPerimetroRectangulo(double base, double altura);
//Fernando Patiño
int main() {
    double base, altura;

    // Entrada de datos
    printf("Ingrese la base del rectángulo: ");
    scanf("%lf", &base);
    printf("Ingrese la altura del rectángulo: ");
    scanf("%lf", &altura);

    printf("Área del rectángulo: %.2lf\n", calcularAreaRectangulo(base, altura));
    printf("Perímetro del rectángulo: %.2lf\n", calcularPerimetroRectangulo(base, altura));

    return 0;
}

double calcularAreaRectangulo(double base, double altura) {
    return base * altura;
}

double calcularPerimetroRectangulo(double base, double altura) {
    return 2 * (base + altura);
}