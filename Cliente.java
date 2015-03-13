
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
    private static int numeroClienteActual = 0;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente()
    {
        numeroCliente = numeroClienteActual++;
        siguienteEnLaCola = new Cliente();
        numeroDeBocadillos = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sampleMethod(int y)
    {
        
    }
}
