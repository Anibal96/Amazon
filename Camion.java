
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoPeso
{
    /**
     * Constructor for objects of class Camion
     */
    public Camion(Enum marca, int edad, int kilometros, int peso)
    {
        super(marca, edad, kilometros, peso);
    }
    
    public boolean esArticulado(){
        boolean articulado = false;
        if(getMarca() == Marca.FORD || getMarca() == Marca.FIAT)
            articulado = true;
        return articulado;
    }
}
