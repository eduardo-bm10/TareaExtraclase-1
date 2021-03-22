package exceptions.ciudadano;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

public class Ciudadano
{
    String name;
    int age;
    int id;

    //Constructor que inicializa un objeto Ciudadano
    public Ciudadano(String name, int age, int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    //Cambia los atributos del ciudadano
    public void changeInfo(String nuevoNombre, int nuevaEdad, int nuevoID) throws InvalidInformationException
    {
        if (nuevaEdad < 0)
            throw new InvalidInformationException("La edad proporcionada es invalida");
        else if (nuevoID < 10000)
            throw new InvalidInformationException("El ID proporcionado es invalido");
        else
        {
            name = nuevoNombre;
            age = nuevaEdad;
            id = nuevoID;
        }
    }
}
