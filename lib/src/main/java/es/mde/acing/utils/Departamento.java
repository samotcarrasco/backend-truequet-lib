package es.mde.acing.utils;

import java.util.List;

public interface Departamento {

	List<Material> getMaterialesOfertados();

	List<Material> getMaterialesAdquiridos();

	AcuartelamientoImpl getAcuartelamiento();

	int getCredito();

}