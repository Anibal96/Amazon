import java.util.ArrayList;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new ArrayList<Vehiculo>();
    }

    public void addVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public boolean removeVehiculo(int id){
        boolean eliminado = false;
        for(int cont = 0; vehiculos.size() > cont || !eliminado ; cont++){
            if(vehiculos.get(cont).getId()==id){
                vehiculos.remove(cont);
            }
        }
        return eliminado;
    }
    
    public String marcaMayoritaria(){
        String marcaMayoritaria = null;
        int ford = 0;
        int opel = 0;
        int citroen = 0;
        int fiat = 0;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getMarca = Marca.FORD)
                ford++;
            else if (vehiculo.getMarca = Marca.OPEL)
                opel++;
            else if (vehiculo.getMarca = Marca.CITROEN)
                CITROEN++;
            else
                fiat++;
        }
        if(ford>opel && ford>citroen && ford>fiat)
            marcaMayoritaria = Marca.FORD;
        else if(opel>ford && opel>citroen && opel>fiat)
            marcaMayoritaria = Marca.OPEL;
        else if(citroen>ford && citroen>opel && citroen>fiat)
            marcaMayoritaria = Marca.CITROEN;
        else if(fiat>ford && fiat>opel && fiat>citroen)
            marcaMayoritaria = Marca.FIAT;
        return marcaMayoritaria;
    }
    
    public boolean cumplenMedidas(){
        boolean cumplenMedidas = true;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo instanceof Coche){
                if(vehiculo.getPlazas() > 5)
                    cumplenMedidas = false;
            }
            else if (vehiculo instanceof FurgonetaPequena)
                if(vehiculo.getPlazas() > 7)
                    cumplenMedidas = false;
            else if (vehiculo instanceof Camion){
                if(vehiculo.esArticulado()){
                    if(vehiculo.getPeso() > 3000)
                        cumplenMedidas = false;
                }
                else{
                    if(vehiculo.getPeso() > 2000)
                        cumplenMedidas = false;
                }
            }
        }
        return cumplenMedidas;
    }
    
    public Integer[] getDatosVehiculo(int id){
        Vehiculo vehiculo = null;
        for(int cont = 0; vehiculos.size() > cont || !eliminado ; cont++){
            if(vehiculos.get(cont).getId()==id){
                vehiculo = vehiculos.get(cont);
            }
        }
        return vehiculo.getDatos();
    }
}
