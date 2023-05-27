package es.mde.acing.utils;

import java.util.List;

public class AcuartelamientoImpl extends UnidadImpl implements Acuartelamiento{
	
	public List<Departamento> departamentos;

	@Override
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
}
