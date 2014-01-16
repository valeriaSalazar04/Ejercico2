/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaG
 */
/**
 * clase que maneja la informacion requerida para generar un pasaje de viaje
 * 
 */
public class Pasaje implements Comparable<Object> {
    
    public int numeroId;
    public int numeroDeSilla;
    public int horaDeSalida;
    public String nombreComprador;
    /**
     * constructor vacio de la clase pasaje
     */
    public Pasaje(){
        
    }
    /**
     * constructor parametrizado de la clase pasaje
     * @param numeroId parametro de tipo entero que representa el numero de identificacion del pasaje
     * @param numeroDeSalida parametro de tipo entero que representa el numero de silla correspondiente al comprador
     * @param horaDeSalida parametro de tipo entero que representa la hora correspondiente de salida del pasaje
     * @param nombreComprador parametro de tipo String que representa el nombre del consumidor 
     */
    public Pasaje (int nummeroId, int numeroDeSilla,int horaDeSalida, String nombreComprador){
        this.numeroId = nummeroId;
        this.numeroDeSilla= numeroDeSilla;
        this.horaDeSalida = horaDeSalida;
        this.nombreComprador = nombreComprador;
    }
    /*
     *  metodo que obtiene el numero de identificacion del pasaje
     */
    public int getNumeroId (){
        return numeroId;
    }
    
    /*
     * metodo que obtiene el nombre del comprador del pasaje
     */
    public String getNombreComprador (){
        return nombreComprador;
    }
    /*
     * 
     */
    public void setNumeroId (int numeroId){
        
        this.numeroId= numeroId;
       
    }
    /*
     * 
     */
    public void setNumeroDeSilla (int numSilla){
        this.numeroDeSilla=numSilla;
    }
    /*
     * 
     */
    public void setHoraDeSalida (int horaSalida){
        this.horaDeSalida=horaSalida;
    }
    /*
     * 
     */
    
    public void setNombreComprador (String nombreComprador){
        this.nombreComprador=nombreComprador;
                
    }

    /*
     * metodo que realiza la debida comparacion de los pasajes respecto a su número de identificación del pasaje
     */
    @Override
    public int compareTo(Object o) {
        
        Pasaje p = (Pasaje)o;
        
        if (this.numeroId> p.getNumeroId()){
            return 1;
        }
        else if (this.numeroId< p.getNumeroId()){
        return -1;
    }
       return 0;
    }
    /*
     * metodo que retorna cuando son iguales un pasaje del otro según su número de identificación de pasaje
     */
    @Override
   public boolean equals (Object o){
       
       Pasaje p = (Pasaje)o;
       
       if (this.numeroId == p.getNumeroId()){
           return true;
       }
       return false;
   }
    
    /*
     * método que retorna la cadena del objeto actual
     */
    public String toString (){
        
        return this.nombreComprador + this.numeroId + this.numeroDeSilla + this.horaDeSalida;
    }
}
