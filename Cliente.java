
/**
 * Clase que simula un cliente de un establecimiento(en este caso bocateria).
 * 
 * @author (Daniel Alvarez Vaquero) 
 * @version (1.0)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private int numeroCliente;
    private Cliente siguienteEnLaCola;
    private int numeroDeBocadillos;
    private static int numeroClienteActual = 1;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(int numeroDeBocadillos)
    {
        numeroCliente = numeroClienteActual++;
        this.siguienteEnLaCola = null;
        this.numeroDeBocadillos = numeroDeBocadillos;
       numeroClienteActual = numeroClienteActual+1;
    }

    /**
     *Metodo que devuelve la siguiente persona en cola
     */
    public Cliente getSiguienteEnLaCola()
    {
        return siguienteEnLaCola;
    }
    
    /**
     * Metodo que devuelve el numero de bocadillos del cliente
     */
    public int getNumeroDeBocadillos()
    {
        return this.numeroDeBocadillos;
    }
    
    /**
     * Metodo que devuelve el numero del cliente
     */
    public int getNumeroCliente()
    {
        return numeroCliente;
    }
    
    /**
     * Metodo que devuelve los datos del cliente
     */
    public String toString()
    {
        String datos = "Cliente: " + numeroCliente + " Nº Bocadillos: "  + numeroDeBocadillos + "("+numeroDeBocadillos*5+ " Euros" +")"; ;
        return datos;
    }
    
    /**
     * Metodo que modifica el numero de cliente en la cola
     */
    public void setSiguienteEnLaCola(Cliente cliente)
    {
        siguienteEnLaCola = cliente;
    }
}
