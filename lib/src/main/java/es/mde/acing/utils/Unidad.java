package es.mde.acing.utils;

import java.util.List;

import es.mde.acing.utils.UnidadImpl.TipoEmpleo;

public interface Unidad {


	String getNombre();
	String getAbreviatura();
	String getEmail();
    TipoEmpleo getResponsableEmpleo();
	String getResponsableNombre();
	String getTelefono();
	String getDireccion();
	String getLatitud();
	String getLongitud();
	
}