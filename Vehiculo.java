
/**
 * Write a description of class Vehiculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehiculo
{
    private static int ids = -1;
    private int id;
    private Enum marca;
    private int edad;
    private int kilometros;
    /**
     * Constructor for objects of class Vehiculo
     */
    public Vehiculo(Enum marca, int edad, int kilometros)
    {
        ids++;
        id = ids;
        this.marca = marca;
        this.edad = edad;
        this.kilometros = kilometros;
    }
    
    public int getId(){
        return id;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getKilometros(){
        return kilometros;
    }
    
    public Enum getMarca(){
        return marca;
    }
    
    abstract int[] getDatos();
}
