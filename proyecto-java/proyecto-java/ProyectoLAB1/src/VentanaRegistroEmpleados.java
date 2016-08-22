public class VentanaRegistroEmpleados extends VentanaPlantillaDeRegistros
{
	private static final int ANCHO = 1300, ALTO =700 ;
	public static void main(String[] args) 
	{
		
		VentanaRegistroEmpleados registroempleados;
		registroempleados = new VentanaRegistroEmpleados();
		// solo se pasa por parametros el titulo de la nueva ventana.
		registroempleados.initGUI("Registro de Empleados"); 
		registroempleados.setVisible(true);
	   
	}

	public VentanaRegistroEmpleados() 
	{
		super();
		setTitle(" Registro de los Empleados");
	    setBounds(ANCHO/2, ALTO/2, ANCHO, ALTO);
	    setLocation(0, 0);
	   
	}
	
}
