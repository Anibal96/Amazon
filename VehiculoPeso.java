
/**
 * Write a description of class VehiculosPeso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPeso extends Vehiculo
{
    private int peso;

    /**
     * Constructor for objects of class VehiculosPeso
     */
    public VehiculoPeso(Enum marca, int edad, int kilometros, int peso)
    {
        super(marca, edad, kilometros);
        this.peso = peso;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public int[] getDatos(){
        int[] datos = new int[4];
        datos[0] = getId();
        datos[1] = getEdad();
        datos[2] = getKilometros();
        datos[3] = peso;
        return datos;
    }
}
