package exceptions.matematica;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

import java.util.Scanner;

public class MainMatematica
{
    public static void main(String[] args)
    {
        Matematica operador = new Matematica();
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Escriba el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        num2 = entrada.nextInt();

        System.out.print("Escriba 1 para realizar una suma\nEscriba 2 para realizar una division: ");
        int operacion = entrada.nextInt();

        if (operacion == 1)
        {
            System.out.printf("El resultado es: %d%n", operador.sumarPositivos(num1, num2));
        }
        else {
            System.out.printf("El resultado es: %d%n", operador.divisionEntera(num1, num2));
        }
    }
}
