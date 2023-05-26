package es.mde.acing.utils;


import java.util.List;

import es.mde.acing.utils.UnidadImpl.TipoEmpleo;



public class DepartamentoImpl extends UnidadImpl implements Unidad, Departamento {
	
	
	public List<Material> materialesOfertados;	
	public List<Material> materialesAdquiridos;
	private AcuartelamientoImpl acuartelamiento;
	private int credito;
    
	


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
	public AcuartelamientoImpl getAcuartelamiento() {
		return acuartelamiento;
	}

	public void setAcuartelamiento(AcuartelamientoImpl acuartelamiento) {
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
	
}