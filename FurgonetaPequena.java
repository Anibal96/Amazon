
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculoPlazas
{

    /**
     * Constructor for objects of class FurgonetaPequeña
     */
    public FurgonetaPequena(Enum marca, int edad, int kilometros, int plazas)
    {
        super(marca, edad, kilometros, plazas);
    }
    
    public int[] getDatos(){
        int[] datos = new int[4];
        datos[0] = getId();
        datos[1] = getEdad();
        datos[2] = getKilometros();
        datos[3] = getPlazas();
        return datos;
    }
}
