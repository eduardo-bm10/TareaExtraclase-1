package exceptions.matematica;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMatematica
{
    public static void main(String[] args)
    {
        Matematica operador = new Matematica();
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try
        {
            System.out.print("Escriba el primer numero: ");
            num1 = entrada.nextInt();
            System.out.print("Escriba el segundo numero: ");
            num2 = entrada.nextInt();
        }
        catch(InputMismatchException ime){
            System.err.println("No ingreso un numero valido");
        }

        System.out.print("Escriba 1 para realizar una suma\nEscriba 2 para realizar una sumar multiplicaciones\nEscriba 3 para dividir: ");
        int operacion = entrada.nextInt();

        if (operacion == 1)
            System.out.printf("El resultado es: %d%n", operador.sumarPositivos(num1, num2));
        else if (operacion == 2) {
            try {
                System.out.printf("El resultado es: %d%n", operador.multiplicacion(num1, num1));
            }catch(IllegalArgumentException nsme){
                System.err.println(nsme.getMessage());
            }
        }
        else if (operacion == 3)
            System.out.printf("El resultado es: %d%n", operador.divisionEntera(num1, num2));
    }
}
