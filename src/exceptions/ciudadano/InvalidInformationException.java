package exceptions.ciudadano;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

//Excepcion que verifica la edad de una persona
public class InvalidInformationException extends Exception
{
    //Constructor
    public InvalidInformationException(String message)
    {
        super(message);//Se llama al constructor de la clase padre Exception
    }
}
