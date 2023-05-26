package es.mde.acing.utils;

import java.util.List;

import es.mde.acing.utils.UnidadImpl.TipoEmpleo;



public abstract class UnidadImpl implements Unidad {
	
	public enum TipoEmpleo { 
		Soldado, 
		Cabo, 
		Suboficial, 
		Oficial
	}

	private String nombre;
	private String abreviatura;
	private String telefono;
	private String direccion;
	private String longitud;
	private String latitud;
	private String email;
	private TipoEmpleo responsableEmpleo;
	private String responsableNombre;
	
	

	@Override
	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Override
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String getDireccion() {
		return direccion;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getEmail() {
		return email;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public TipoEmpleo getResponsableEmpleo() {
		return responsableEmpleo;
	}

	@Override
	public String getResponsableNombre() {
		return responsableNombre;
	}

	@Override
	public String getLatitud() {
		return latitud;
	}

	@Override
	public String getLongitud() {
		return longitud;
	}
	

    
}
