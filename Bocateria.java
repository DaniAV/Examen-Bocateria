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
     * Metodo que simula la llegada de un cliente a la cola
     */
    public void llegaNuevoClienteALaCola(int numeroDeBocadillos)
    {
        Cliente nuevoCliente = new Cliente(numeroDeBocadillos);
        if(primeraPersonaEnCola == null)
        {
            primeraPersonaEnCola = nuevoCliente;
        }
        else
        {
            primeraPersonaEnCola.setSiguienteEnLaCola(nuevoCliente);
        }
    }

    /**
     * Metodo que muestra por pantalla los datos de los clientes 
     * que estan a la cola actualmente
     */
    public void visualizaDatosClientesEnCola()
    {
        boolean salir = false;
        Cliente primero = primeraPersonaEnCola; //se guarda el primero en cola
        if(primero != null)
        {
            //repetir esto
            while(salir == false)
            {
                System.out.println(primero.toString()); //Se imprime el primero en cola
                if(primero.getSiguienteEnLaCola() != null) //Si hay alguno despues
                {
                    primero = primero.getSiguienteEnLaCola();
                    System.out.println(primero.toString());
                }
                else
                {
                    salir = true;
                }
            }
        }
    }

    /**
     * Metodo que despacha al cliente primero en la cola
     */
    public void despacharClienteActual()
    {
        facturacionActual = (primeraPersonaEnCola.getNumeroDeBocadillos()) * PRECIO_BOCADILLO;
        clientesDEspachados.put(primeraPersonaEnCola.getNumeroCliente(), primeraPersonaEnCola);
        primeraPersonaEnCola = primeraPersonaEnCola.getSiguienteEnLaCola();
    }

    /**
     * Metodo que muestra los datos de la bocateria en el momento actual
     */
    public void InformacionDeLaBocateria()
    {
        System.out.println("Factuaracion actual: " + facturacionActual);
        System.out.println("Estado de la cola:");
        Cliente primero = primeraPersonaEnCola;
        while(primero != null)
        {
            System.out.println(primero.toString());
            primero = primero.getSiguienteEnLaCola();
        }
    }
}

