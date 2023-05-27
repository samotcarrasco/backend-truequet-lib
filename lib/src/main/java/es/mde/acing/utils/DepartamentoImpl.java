package es.mde.acing.utils;


import java.util.List;

import es.mde.acing.utils.UnidadImpl.TipoEmpleo;



public class DepartamentoImpl extends UnidadImpl implements Departamento {
	
	
	public List<Material> materialesOfertados;	
	public List<Material> materialesAdquiridos;
	private Acuartelamiento acuartelamiento;
	private int credito;
	private String longitud;
	private String latitud;
	


	@Override
	public List<Material> getMaterialesOfertados() {
		return materialesOfertados;
	}

	public void setMaterialesOfertados(List<Material> materialesOfertados) {
		this.materialesOfertados = materialesOfertados;
	}

	@Override
	public List<Material> getMaterialesAdquiridos() {
		return materialesAdquiridos;
	}

	public void setMaterialesAdquiridos(List<Material> materialesAdquiridos) {
		this.materialesAdquiridos = materialesAdquiridos;
	}


	@Override
	public Acuartelamiento getAcuartelamiento() {
		return acuartelamiento;
	}

	public void setAcuartelamiento(Acuartelamiento acuartelamiento) {
		this.acuartelamiento = acuartelamiento;
	}


	@Override
	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Departamento, nombre" + getAbreviatura() + "]";
	}

	@Override
	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
     
	@Override
	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	
}