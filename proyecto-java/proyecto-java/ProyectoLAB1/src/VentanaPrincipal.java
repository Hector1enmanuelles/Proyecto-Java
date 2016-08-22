
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/** 
 * Ventana Principal.
 * Ventana principal de la aplicación.
 * @author Héctor Mendoza 
 * @version 1.0
 * fecha de Creación 05/Agosto/2016 
 * Edición: 06'30 am hasta 09'20 am
 * Modificación: 10/AGO/2016.
 * Modificación: 20/AGO/2016.
*/

public class VentanaPrincipal extends JFrame 
{
	private static final int ANCHO=1360;
	private static final int ALTO=710;
	
	private PanelFondo panelFondo;
	private JMenuBar mnMenu;
	private JMenu mnMenuGestionarEntrevistas;
	private JMenu mnMenuGestionarRegistros;
	private JMenu mnMenuGestionarProyectos;
	private JMenu mnMenuGestionarDias;
	private JMenu mnMenuGestionarHorasDeTrabajo;
	private JMenu mnMenuGestionarPagos;
	private JMenuItem mntmMenuItemRegistrarEmpleados;
	private JMenuItem mntmMenuItemRegistrarClientes;
	private JMenuItem mntmMenuItemSalir;
	
	private JMenu mnMenuSalir;
	
	

	public static void main(String[] args)
	{
		VentanaPrincipal ventanaPrincipal;
		ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.setSize(ANCHO,ALTO);
		ventanaPrincipal.setLocation(0,0);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setVisible(true);
	}

	public VentanaPrincipal()
	{
		super();
		setTitle(" System-Selección de Personal-Empresa xxx");
	    setBounds(ANCHO/2, ALTO/2, ANCHO, ALTO);
		initGUI();
	}
	
	private void initGUI() 
	{
		// Le indicamos que finalice la aplicacion cuando se haga click
		// en la X (Cerrar) de la Ventana
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// El Layout del JFrame sera de tipo BorderLayout
		getContentPane().setLayout(new BorderLayout());
		{
			{
			 // Instanciamos un panel que sera el contenedor de los componentes del formulario
				panelFondo = new PanelFondo();
			 // Agregamos el panel al JFrame
			    getContentPane().add(panelFondo, BorderLayout.CENTER);
			 // Indicamos el tamaño y posicion del panel 
			    panelFondo.setBounds(12, 12, 366, 241);
			 //Le colocamos al panel el color de fondo blanco
			    panelFondo.setBackground(new Color(192, 192, 192));
			 //Indicamos que el panel no tendra Layout
			    panelFondo.setLayout(null);
				
			}
			
			// Para crear el menu principal.
			    
			{
			    mnMenu = new JMenuBar();
			    mnMenu.setBounds(0, 0, 1348, 21);
			    panelFondo.add(mnMenu);
			}
			
			// Opción del menu para gestionar entrevistas. 
			
			{
			    mnMenuGestionarEntrevistas = new JMenu("Gestionar Entrevistas");
			    mnMenuGestionarEntrevistas.setIcon(new ImageIcon(getClass().
			    		                           getResource("imagenes/16 pixeles/imgentrevista.png")));
			    mnMenu.add(mnMenuGestionarEntrevistas);
			    
			}
			
			// Opción del menu para gestionar registros.
			
			{
				mnMenuGestionarRegistros = new JMenu("Gestionar Registros");
				mnMenuGestionarRegistros.setIcon(new ImageIcon(getClass().
						                         getResource("imagenes/16 pixeles/imgreporte.png")));
				mnMenu.add(mnMenuGestionarRegistros);
				mntmMenuItemRegistrarEmpleados = new JMenuItem("Registrar Empleados");
			    mntmMenuItemRegistrarClientes = new JMenuItem("Registrar Clientes");

			    //Abrir la ventana de registro de los Empleados.
			    mntmMenuItemRegistrarEmpleados.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) 
			    	{
			    		VentanaRegistroEmpleados registroempleados = new VentanaRegistroEmpleados();
			    		registroempleados.setVisible(true);
			    	}
			    });
			    mnMenuGestionarRegistros.add(mntmMenuItemRegistrarEmpleados);
			    mntmMenuItemRegistrarEmpleados.setIcon(new ImageIcon(getClass().
			    		                               getResource("imagenes/16 pixeles/imgregistrar.png")));
			    
			    // Abrir la ventana de registro de los clientes.
			    mntmMenuItemRegistrarClientes.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) 
			    	{
			    		VentanaRegistroClientes registroclientes = new VentanaRegistroClientes();
			    		registroclientes.setVisible(true);
			    	}
			    });
			    mnMenuGestionarRegistros.add(mntmMenuItemRegistrarClientes);
			    mntmMenuItemRegistrarClientes.setIcon(new ImageIcon(getClass().
			    		getResource("imagenes/16 pixeles/imgregistrarcliente.png")));
			    
			}
			
			// Opción del menu para getionar proyectos.
			
			{
				mnMenuGestionarProyectos = new JMenu("Gestionar Proyectos");
				mnMenuGestionarProyectos.setIcon(new ImageIcon(getClass().
				                                   getResource("imagenes/16 pixeles/imgproyecto.png")));
				mnMenu.add(mnMenuGestionarProyectos);	
			}
			
			// Opción del menu para Gestionar Días.
			
			{
				mnMenuGestionarDias = new JMenu("Gestionar Días");
				mnMenuGestionarDias.setIcon(new ImageIcon(getClass().
				getResource("imagenes/16 pixeles/imgproyecto.png")));
				mnMenu.add(mnMenuGestionarDias);
				
			}
			
	        // Opción del menu para Gestionar Horas de Trabajo.
			
			{
				mnMenuGestionarHorasDeTrabajo = new JMenu("Gestionar Horas de Trabajo");
				//mnMenuGestionarHorasDeTrabajo.setIcon(new ImageIcon(getClass().
				//getResource("imagenes/imgproyecto.png")));
				mnMenu.add(mnMenuGestionarHorasDeTrabajo);
				
			}
			
	        // Opción del menu para Gestión de Pagos.
			
			{
				mnMenuGestionarPagos = new JMenu("Gestión de Pagos");
				//mnMenuGestionarPagos.setIcon(new ImageIcon(getClass().getResource("imagenes/imgproyecto.png")));
				mnMenu.add(mnMenuGestionarPagos);
				
			}
			
			{
				mnMenuSalir = new JMenu("Salir");
				mnMenuSalir.setIcon(new ImageIcon(getClass().getResource("imagenes/16 pixeles/imgsalir.png")));
				mnMenu.add(mnMenuSalir);	
				mntmMenuItemSalir = new JMenuItem("Salir");
				mntmMenuItemSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						if (javax.swing.JOptionPane.showConfirmDialog(null, "Seguro que desea Salir", "System-Selección de Personal-",
								javax.swing.JOptionPane.YES_NO_OPTION) == 0) 
						{
							dispose();
						}
					}
				});
			    mnMenuSalir.add(mntmMenuItemSalir);
			
			}
			
		}
	}
}
