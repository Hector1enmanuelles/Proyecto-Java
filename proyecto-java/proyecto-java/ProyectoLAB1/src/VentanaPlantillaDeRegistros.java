import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JCalendar;

public class VentanaPlantillaDeRegistros extends JFrame
{
	//Declaración de Constantes.
	private static final int ANCHO=1300, ALTO=700;
	private JPanel panContenedor;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtApellido; 
	private JTextField txtCorreoElectronico;
	private JTextField txtDireccion;
	private JTextField txtEstado;
	private JTextField txtCiudad;
	private JTextField txtMunicipio;
	private JTextField txtNumeroCelular;
	private JTextField txtNumeroLocal;
	private JCalendar txtFechaNacimiento;
	private JComboBox<String> cmbCodigoNumeroCelular;
	private JComboBox<String> cmbCodigoNumeroLocal;
    private JComboBox cmbEstadoCivil;
	private JComboBox cmbDia;
	private JComboBox cmbMes;
	private JComboBox cmbanno;
	private JComboBox<String> cmbCedula;
	private JCheckBoxMenuItem cbmiOptionSexo;
	private JLabel lblTitulo;
	private JLabel lblCedula;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblSexo;
	private JLabel lblCorreoElectronico;
	private JLabel lblDireccion;
	private JLabel lblEstado;
	private JLabel lblCiudad;
	private JLabel lblMunicipio;
	private JLabel lblNumeroCelular;
	private JLabel lblNumeroLocal;
	private JLabel lblEstadoCivil;
	private JLabel lblFechaNacimiento;
	private JLabel lblImagen; //Contenedor de la imagen.
	private JRadioButton rdbtnFemenino;
	

	public static void main(String[] args) 
	{
		VentanaPlantillaDeRegistros registroempleados;
		registroempleados = new VentanaPlantillaDeRegistros();
		registroempleados.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public VentanaPlantillaDeRegistros( ) 
	{
		super();
	    setBounds(ANCHO/2, ALTO/2, ANCHO, ALTO);
	    setLocation(0, 0);
		initGUI("");
	}

	protected void initGUI(String name) 
	{
		// Le indicamos que finalice la aplicacion cuando se haga click
		// en la X (Cerrar) de la Ventana
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// El Layout del JFrame sera de tipo BorderLayout
		getContentPane().setLayout(new BorderLayout());
		{
			{// Instanciamos un panel que sera el contenedor de los componentes del formulario
				panContenedor = new JPanel();
			// Agregamos el panel al JFrame
			    getContentPane().add(panContenedor, BorderLayout.CENTER);
			// Indicamos el tamaño y posicion del panel 
			    panContenedor.setBounds(12, 12, 366, 241);
			//Le colocamos al panel el color de fondo blanco
			    panContenedor.setBackground(new java.awt.Color(192,192,192));
			//Indicamos que el panel no tendra Layout
			    panContenedor.setLayout(null);
			    panContenedor.setPreferredSize(new java.awt.Dimension(340, 150));
			}
			
			{

				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(Color.WHITE, 2));
				panel.setBounds(757, 76, 174, 163);
				panContenedor.add(panel);		
				{
					lblImagen = new JLabel();
					panel.add(lblImagen);
					lblImagen.setIcon(new ImageIcon(getClass().getResource("imagenes/64 pixeles/imgninia.png")));
				}
			}
			
			
			
			{
				// Instanciamos una etiqueta y Asignamos el valor al texto de la etiqueta
				lblTitulo = new JLabel(name);
				// Indicamos el tamaño y posicion de la etiqueta
				lblTitulo.setBounds(560, 50, 192, 24);
				// Agregamos la etiqueta al JPanel					
				panContenedor.add(lblTitulo);
			}
			
			{
				lblCedula = new JLabel("Cedula");
				panContenedor.add(lblCedula);
				lblCedula.setBounds(336, 126, 159, 15);
			}
			
			{
				cmbCedula = new JComboBox<String>();
				panContenedor.add(cmbCedula);
				cmbCedula.setBounds(455, 122, 40, 22);
				cmbCedula.addItem("V");
				cmbCedula.addItem("E");
				cmbCedula.addItem("J");
				
			}
			
			{
				txtCedula = new JTextField();
				panContenedor.add(txtCedula);
				txtCedula.setBounds(518, 123, 146, 22);
				ValidarNumero(txtCedula, "Ingrese Un  número de cédula válido ejemplo: 10352123");
			}
			
			{
				lblNombre = new JLabel("Nombre");
				panContenedor.add(lblNombre);
				lblNombre.setBounds(335, 153, 159, 15);
				
			}
			
			{
				txtNombre = new JTextField();
				panContenedor.add(txtNombre);
				txtNombre.setBounds(518, 150, 146, 22);
				Validar(txtNombre, "No debe ingresar números, ingrese un nombre"
						+ " válido ejemplo: Juan.");
			}
			
			{
				lblApellido = new JLabel("Apellido");
				panContenedor.add(lblApellido);
				lblApellido.setBounds(336, 183, 159, 15);
			}
			
			{
				txtApellido = new JTextField();
				panContenedor.add(txtApellido);
				txtApellido.setBounds(518, 180, 146, 22);
				Validar(txtApellido, "No debe ingresar números, ingrese un apellido"
						+ " válido ejemplo: Mendoza.!!!");
				
			}
			
			{
				lblSexo = new JLabel("Sexo");
				panContenedor.add(lblSexo);
				lblSexo.setBounds(336, 210, 159, 15);
			}
			{
				cbmiOptionSexo = new JCheckBoxMenuItem();
				panContenedor.add(cbmiOptionSexo);
				
			}
			
			{
				lblCorreoElectronico = new JLabel("Correo Electrónico");
				panContenedor.add(lblCorreoElectronico);
				lblCorreoElectronico.setBounds(304, 246, 159, 15);
			}
			
			{
				txtCorreoElectronico = new JTextField();
				panContenedor.add(txtCorreoElectronico);
				txtCorreoElectronico.setBounds(518, 243, 146, 22);
			}
			
			{
				lblDireccion = new JLabel("Dirección");
				panContenedor.add(lblDireccion);
				lblDireccion.setBounds(336, 280, 159, 15); 
				
			}
			
			{
				txtDireccion = new JTextField();
				panContenedor.add(txtDireccion);
				txtDireccion.setBounds(518, 277, 146, 22);
			}
			
			{
				lblEstado = new JLabel("Estado");
				panContenedor.add(lblEstado);
				lblEstado.setBounds(141, 314, 159, 15);
			}
			
			{
				txtEstado = new JTextField();
				panContenedor.add(txtEstado);
				txtEstado.setBounds(518, 311, 146, 22);
				Validar(txtEstado, "No debe ingresar números, ingrese un Estado"
						+ " válido ejemplo: Lara.");
			}
			
			{
				lblFechaNacimiento = new JLabel("Fecha de Nacimiento");
				panContenedor.add(lblFechaNacimiento);
			    lblFechaNacimiento.setBounds(86, 367, 159, 15);
				
			}
			
			{
				txtFechaNacimiento = new JCalendar();
				panContenedor.add(txtFechaNacimiento);
				txtFechaNacimiento.setBounds(336, 314, 159, 15);
			}
			
			{
				lblCiudad = new JLabel("Ciudad");
				panContenedor.add(lblCiudad);
				lblCiudad.setBounds(336, 344, 159, 15);
			}
			
			{
				txtCiudad = new JTextField();
				panContenedor.add(txtCiudad);
				txtCiudad.setBounds(518, 341, 146, 22);
				Validar(txtCiudad, "No debe ingresar números, ingrese una ciudad "
						+ " válida ejemplo: Barquisimeto.");
			}
			
			{
				lblMunicipio = new JLabel("Municipio");
				panContenedor.add(lblMunicipio);
				lblMunicipio.setBounds(323, 370, 159, 15);
			}
			
			{
				txtMunicipio = new JTextField();
				panContenedor.add(txtMunicipio);
				txtMunicipio.setBounds(518, 367, 146, 22);
				Validar(txtMunicipio,"No ingrese números, ingrese un municipio válido"
						+ " Ejemplo: Iribarren.");
			
			}
			
			{
				lblNumeroCelular = new JLabel("Número celular");
				panContenedor.add(lblNumeroCelular);
				lblNumeroCelular.setBounds(323, 397, 159, 15);
			}
			{
				cmbCodigoNumeroCelular = new JComboBox<String>();
				panContenedor.add(cmbCodigoNumeroCelular);
				cmbCodigoNumeroCelular.setBounds(435, 397, 60, 22);
				cmbCodigoNumeroCelular.addItem("0426");
				cmbCodigoNumeroCelular.addItem("0416");
				cmbCodigoNumeroCelular.addItem("0424");
				cmbCodigoNumeroCelular.addItem("0414");
				cmbCodigoNumeroCelular.addItem("0412");
			}
			
			{
				txtNumeroCelular = new JTextField();
				panContenedor.add(txtNumeroCelular);
				txtNumeroCelular.setBounds(518, 398, 146, 22);
				ValidarNumero(txtNumeroCelular, "No debe ingresar letras, ingrese el número"
						+ " celular ejemplo: 5555555.");
			}
			
			{
				lblNumeroLocal = new JLabel("Número Local");
				panContenedor.add(lblNumeroLocal);
				lblNumeroLocal.setBounds(323, 424, 159, 15);
			}
			{
				cmbCodigoNumeroLocal = new JComboBox<String>();
				panContenedor.add(cmbCodigoNumeroLocal);
				cmbCodigoNumeroLocal.setBounds(434, 424, 60, 22);
				cmbCodigoNumeroLocal.addItem("0251");
				cmbCodigoNumeroLocal.addItem("0253");
				cmbCodigoNumeroLocal.addItem("0212");
			}
			
			{
				txtNumeroLocal = new JTextField();
				panContenedor.add(txtNumeroLocal);
				txtNumeroLocal.setBounds(518, 425, 146, 22);
				ValidarNumero(txtNumeroLocal, "No debe ingresar letras, ingrese el número"
						+ " loca ejemplo: 5555555.");
			
			}
		
	    }
		
		JRadioButton rdbtnmasculino = new JRadioButton("M");
		rdbtnmasculino.setBounds(515, 206, 48, 23);
		rdbtnmasculino.setBackground(new java.awt.Color(192,192,192));
		panContenedor.add(rdbtnmasculino);
		{
			rdbtnFemenino = new JRadioButton("F");
			rdbtnFemenino.setBounds(565, 206, 149, 23);
			rdbtnFemenino.setBackground(new java.awt.Color(192,192,192));
			panContenedor.add(rdbtnFemenino);
		}

	}
	
	public void Validar (JTextField txtGeneral, String mensaje)
	{
		txtGeneral.addKeyListener(new KeyListener() {
			
			
			public void keyTyped(KeyEvent e) 
			{
				int k = (int) e.getKeyChar();//k = al valor de la tecla presionada   
		        if (k > 47 && k < 58) 
		        {//Si el caracter ingresado es una letra
		            e.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
		            JOptionPane.showMessageDialog(null, mensaje,"Validando Datos", JOptionPane.ERROR_MESSAGE);
		        }
			}
			
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) 	{}
		});
		
	}
	
	public void ValidarNumero (JTextField txtGeneral, String mensaje)
	{
		txtGeneral.addKeyListener(new KeyListener() {
			
			
			public void keyTyped(KeyEvent e) 
			{
				int k = (int) e.getKeyChar();//k = al valor de la tecla presionada   
		        if ((k >= 32 && k < 47) || (k >= 58 && k < 255)) 
		        {//Si el caracter ingresado es una letra
		            e.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
		            JOptionPane.showMessageDialog(null, mensaje,"Validando Datos", JOptionPane.ERROR_MESSAGE);
		        }
			}
			
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) 	{}
		});
		
	}
}
