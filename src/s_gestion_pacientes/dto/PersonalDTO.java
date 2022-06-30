package	s_gestion_pacientes.dto;

import java.io.Serializable;

public class PersonalDTO implements Serializable 
{	
	private String tipo_id;
	private int id;
	private String nombreCompleto;
	private String ocupacion;
	private String usuario;
	private String clave;

    public PersonalDTO(){
		super();
	}

	public PersonalDTO(String tipo_id, int id, String nombreCompleto, String ocupacion, String usuario, String clave) {
		this.tipo_id = tipo_id;
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.ocupacion = ocupacion;
		this.usuario = usuario;
		this.clave = clave;
	}

	public String getTipo_id() {
		return tipo_id;
	}

	public int getId() {
		return id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setTipo_id(String tipo_id) {
		this.tipo_id = tipo_id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
}
