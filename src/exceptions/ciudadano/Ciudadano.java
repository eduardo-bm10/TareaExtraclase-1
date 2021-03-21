package exceptions.ciudadano;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

public class Ciudadano
{
    String name;
    int age;
    int id;

    public Ciudadano(String name, int age, int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void changeInfo(String nuevoNombre, int nuevaEdad, int nuevoID) throws InvalidInfoException
    {
        if (nuevaEdad < 0)
            throw new InvalidInfoException("La edad proporcionada es invalida");
        else if (nuevoID < 10000)
            throw new InvalidInfoException("El ID proporcionado es invalido");
        else
        {
            name = nuevoNombre;
            age = nuevaEdad;
            id = nuevoID;
        }
    }
}
