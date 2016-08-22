import java.util.Date;

/** 
 * Clase Gernerica Persona.
 * Sirve para que de ella Hereden las demás clases.
 * @author Héctor Mendoza 
 * @version 1.0
 * fecha de Creación 01/Agosto/2016 
 * Edición: 04'45pm hasta 5'45 pm
*/
public class Persona 
{
	protected String cedula;
	protected String nombre;
	protected String apellido;
	protected String estadoCivil;
	protected String correoElectronico;
	protected String direccion;
	protected String estado;
	protected String ciudad;
	protected String municipio;
	protected String sexo;
	protected Date   fechaDeNacimiento;
	protected int    numeroCelular;
	protected int    numeroLocal;
	
	// Constructor de la clase Persona, la clase posee dos constructores uno con parametros
	// y otro sin parametros.
	public Persona() {}

	public Persona(String cedula, String nombre, String apellido, Date fechaDeNacimiento, 
			String estadoCivil, String correoElectronico, String direccion,String estado, String ciudad, 
			String municipio, String sexo, int numeroCelular, int numeroLocal) 
	{
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.estadoCivil = estadoCivil;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
		this.estado = estado;
		this.ciudad = ciudad;
		this.municipio = municipio;
		this.sexo = sexo;
		this.numeroCelular = numeroCelular;
		this.numeroLocal = numeroLocal;
	}
    
	// Métodos Setteres y Getteres
	
	public String getCedula()
	{
		return cedula;
	}

	public void setCedula(String cedula) 
	{
		this.cedula = cedula;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() 
	{
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento)
	{
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCorreoElectronico()
	{
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico)
	{
		this.correoElectronico = correoElectronico;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public String getEstado()
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}

	public String getCiudad() 
	{
		return ciudad;
	}

	public void setCiudad(String ciudad) 
	{
		this.ciudad = ciudad;
	}

	public String getMunicipio() 
	{
		return municipio;
	}

	public void setMunicipio(String municipio) 
	{
		this.municipio = municipio;
	}
	
	public String getSexo() 
	{
		return sexo;
	}

	public void setSexo(String sexo) 
	{
		this.sexo = sexo;
	}

	public int getNumeroCelular()
	{
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) 
	{
		this.numeroCelular = numeroCelular;
	}

	public int getNumeroLocal() 
	{
		return numeroLocal;
	}

	public void setNumeroLocal(int numeroLocal) 
	{
		this.numeroLocal = numeroLocal;
	}

}