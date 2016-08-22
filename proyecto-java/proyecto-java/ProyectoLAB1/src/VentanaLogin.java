import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class VentanaLogin extends JFrame{

	private static final int ANCHO=400, ALTO=200;
	private JPanel panContenedor;
	private JButton btnIngresar;
	private JTextField txtUsuario;
	private JLabel lblUsuario;
	private JPasswordField passContraseña;
	private JLabel lblContraseña;
	private JLabel lblTitulo;

	public VentanaLogin()
	{
		super();
		setTitle(" Verificación de Usuario");
	    setBounds(ANCHO/2, ALTO/2, ANCHO, ALTO);
		initGUI();
	}
	
	public static void main(String args[])
	{
	VentanaLogin loginMarco;
	loginMarco = new VentanaLogin();
	loginMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	loginMarco.setVisible(true);
	}

	private void initGUI() {
		try {
			// Le indicamos que finalice la aplicacion cuando se haga click
			// en la X (Cerrar) de la Ventana
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			// El Layout del JFrame sera de tipo BorderLayout
			getContentPane().setLayout(new BorderLayout());
			{
				// Instanciamos un panel que sera el contenedor de los componentes del formulario
				panContenedor = new JPanel();
				// Agregamos el panel al JFrame
				getContentPane().add(panContenedor, BorderLayout.NORTH);
				// Indicamos el tamaño y posicion del panel 
				panContenedor.setBounds(12, 12, 366, 241);
				//Le colocamos al panel el color de fondo blanco
				panContenedor.setBackground(new java.awt.Color(192,192,192));
				//Indicamos que el panel no tendra Layout
				panContenedor.setLayout(null);
				panContenedor.setPreferredSize(new java.awt.Dimension(340, 150));
				
				{
					// Instanciamos una etiqueta y Asignamos el valor al texto de la etiqueta
					lblTitulo = new JLabel("Verificación De Usuario");
					// Indicamos el tamaño y posicion de la etiqueta
					lblTitulo.setBounds(102, 0, 192, 24);
					// Agregamos la etiqueta al JPanel					
					panContenedor.add(lblTitulo);
				}
				
				{
					lblUsuario = new JLabel("Nombre de Usuario");
					panContenedor.add(lblUsuario);
					lblUsuario.setBounds(12, 36, 159, 15);
				}
				
				{
					txtUsuario = new JTextField();
					panContenedor.add(txtUsuario);
					txtUsuario.setBounds(169, 33, 146, 22);
					// Agregamos un Listener al JTextField
					// encargado de estar pendiente de un evento					
					txtUsuario.addKeyListener(new KeyListener() {
						
						
						public void keyTyped(KeyEvent e) 
						{
							int k = (int) e.getKeyChar();//k = al valor de la tecla presionada   
					        if (k > 47 && k < 58) 
					        {//Si el caracter ingresado es una letra
					            e.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
					            JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", 
					            		"Validando Datos", JOptionPane.ERROR_MESSAGE);
					        }
						}
						
						public void keyReleased(KeyEvent e) {}
						public void keyPressed(KeyEvent e) 	{}
					}); 
				}
				
				{
					lblContraseña = new JLabel("Contraseña");
					// Asignar una imagen a la etiqueta contraseña.
					lblContraseña.setIcon(new ImageIcon(getClass().getResource("imagenes/48 pixeles/imgseguridad.png")));
					panContenedor.add(lblContraseña);
					lblContraseña.setBounds(22, 57, 159, 33);
				}
				
				{
					passContraseña = new JPasswordField();
					panContenedor.add(passContraseña);
					passContraseña.setBounds(169, 63, 146, 22);
				}
				
				{
					// Instanciamos un JButton, asignamos un valor al texto del JButton 
					btnIngresar = new JButton("Ingresar");
					// Agregamos el JButton al JPanel 
					panContenedor.add(btnIngresar);
					btnIngresar.setIcon(new ImageIcon(getClass().getResource("imagenes/16 pixeles/imgcargarlogin.png")));
					// Indicamos el tamaño y posicion del JButton					
					btnIngresar.setBounds(102, 93, 174, 22);
					
					pack();
				}

			}

			
			this.setSize(361, 150);
		} catch (Exception e) {
		    
			e.printStackTrace();
		}
	}
}