
/**
 * Write a description of class VehiculosPlazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPlazas extends Vehiculo
{
    private int plazas;
    /**
     * Constructor for objects of class VehiculosPlazas
     */
    public VehiculoPlazas(Enum marca, int edad, int kilometros, int plazas)
    {
        super(marca, edad, kilometros);
        this.plazas = plazas;
    }
    
    public int getPlazas(){
        return plazas;
    }
    
    abstract int[] getDatos();
}
