package exceptions.matematica;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

import java.lang.ArithmeticException;

public class Matematica
{
    int resultado;

    public int sumarPositivos(int numero1, int numero2) throws InvalidNumberException
    {
        if (numero1 < 0)
            throw new InvalidNumberException("No ingreso un numero positivo");
        else if (numero2 < 0)
            throw new InvalidNumberException("No ingreso un numero positivo");
        else
            return resultado = numero1 + numero2;

    }
    public int divisionEntera(int numerador, int denominador)
    {
        if (denominador == 0)
            throw new ArithmeticException("No es posible dividir entre cero");
        else
            return resultado = numerador / denominador;
    }
}
