
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoPlazas
{
    /**
     * Constructor for objects of class Coche
     */
    public Coche(Enum marca, int edad, int kilometros, int plazas)
    {
        super(marca, edad, kilometros, plazas);
    }
    
    public int tiempoRevision(){
        int tiempo = 1;
        if(getMarca() == Marca.FORD){
            tiempo = 2;
        }
        return tiempo;
    }
    
    public int[] getDatos(){
        int[] datos = new int[5];
        datos[0] = getId();
        datos[1] = getEdad();
        datos[2] = getKilometros();
        datos[3] = getPlazas();
        datos[4] = tiempoRevision();
        return datos;
    }
}
