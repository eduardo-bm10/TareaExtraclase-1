package exceptions.ciudadano;
//Tarea Extraclase - Algoritmos y Estructuras de Datos I
//Nombre: Eduardo Bolivar Minguet
//Carne: 2020158103

import java.util.Scanner;

public class MainCiudadano
{
    public static void main(String[] args)
    {
        Ciudadano ciudadano1 = new Ciudadano("Eduardo", 19, 2020158103);
        Scanner entrada = new Scanner(System.in);

        System.out.printf("El ciudadano1 se llama %s, tiene %d años y su ID es %d%n", ciudadano1.name, ciudadano1.age, ciudadano1.id);

        System.out.print("Escriba el nuevo nombre: ");
        String nuevoNombre = entrada.nextLine();
        System.out.print("Escriba la nueva edad: ");
        int nuevaEdad = entrada.nextInt();
        System.out.print("Escriba el nuevo ID: ");
        int nuevoID = entrada.nextInt();

        try
        {
            ciudadano1.changeInfo(nuevoNombre, nuevaEdad, nuevoID);
        }
        catch(InvalidInfoException iie)
        {
            System.err.println(iie.getMessage());
        }
        finally
        {
            System.out.printf("Info del ciudadano: %nNombre: %s%nEdad: %d%nID: %d%n", nuevoNombre, nuevaEdad, nuevoID);
        }
    }
}
