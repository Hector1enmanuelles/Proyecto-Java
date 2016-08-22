/**@author Hector Mendoza.
 * @version 1.0
 * como se puede visualizar la clase Ventana Cliente hereda 
 * de una clase llamada VentanaPlantilladeRegistros.
 * */

public class VentanaRegistroClientes extends VentanaPlantillaDeRegistros
{
	private static final int ANCHO = 1300, ALTO =700 ;
	public static void main(String[] args) 
	{
		VentanaRegistroClientes registroclientes;
		registroclientes = new VentanaRegistroClientes();
		registroclientes.initGUI("Registro de Clientes"); // solo se pasa por parametros el titulo de la nueva ventana.
		registroclientes.setVisible(true);
	   
	}

	/**
	 * Create the application.
	 */
	public VentanaRegistroClientes() 
	{
		super();
		setTitle(" Registro de los Clientes");
	    setBounds(ANCHO/2, ALTO/2, ANCHO, ALTO);
	    setLocation(0, 0);
	   
	}
	
}