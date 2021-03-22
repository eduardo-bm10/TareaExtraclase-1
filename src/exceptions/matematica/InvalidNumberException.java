package exceptions.matematica;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

//Excepcion personalizada que verifica la naturaleza de un numero
public class InvalidNumberException extends RuntimeException
{
    public InvalidNumberException(String message)
    {
        super(message);
    }
}
