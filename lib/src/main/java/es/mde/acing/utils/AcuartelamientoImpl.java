package es.mde.acing.utils;

import java.util.List;

public class AcuartelamientoImpl extends UnidadImpl implements Acuartelamiento{
	
	public List<DepartamentoImpl> departamentos;

	@Override
	public List<DepartamentoImpl> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<DepartamentoImpl> departamentos) {
		this.departamentos = departamentos;
	}

	
}
