//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

import java.util.Scanner;

public class PruebaThrow
{
    private int num1; //Numerador de la division
    private int num2; //Denominador de la division
    Scanner entrada = new Scanner(System.in); //Variable que guarda entrada del usuario por medio del teclado

    //Metodo division que verifica si se realiza division entre cero
    public int division() throws ArithmeticException
    {
        this.num1 = entrada.nextInt();
        this.num2 = entrada.nextInt();

        if (num2 != 0)
            return num1/num2;
        else
            throw new ArithmeticException("You can't divide by zero"); //Envia la excepcion si se divide por cero
    }
}
