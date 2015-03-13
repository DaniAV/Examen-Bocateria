import java.util.HashMap;
/**
 * Clase que simula una bocateria
 * 
 * @author (Daniel Alvarez Vaquero) 
 * @version (1.0)
 */
public class Bocateria
{
    // instance variables - replace the example below with your own
    private Cliente primeraPersonaEnCola;
    private int facturacionActual;
    private HashMap<Integer, Cliente> clientesDEspachados;
    private static final int PRECIO_BOCADILLO = 5;

    /**
     * Constructor for objects of class Bocateria
     */
    public Bocateria()
    {
        primeraPersonaEnCola = null;
        facturacionActual = 0;
        clientesDEspachados = new HashMap();
    }

    /**
     * 
     */
    public void llegaNuevoClienteALaCola()
    {
        primeraPersonaEnCola = new Cliente();
    }
}
