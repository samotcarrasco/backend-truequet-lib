package es.mde.acing.utils;


import java.util.List;



public class CategoriaImpl implements Categoria{
	
	public static enum TipoGrupo {
		Informatica,
	    Comunicaciones,
	    Mobiliario_Oficina,
	    Material_Oficina,
	    Otros
	}
	
	public List<Material> materiales;
	
	private String categoria;
	private String descripcion;
	private int minMilis;
	private int maxMilis;
	
	private Categoria categoriaPadre;
	private List<Categoria> categoriasHijas;

	
	@Override
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int getMinMilis() {
		return minMilis;
	}

	public void setMinMilis(int minMilis) {
		this.minMilis = minMilis;
	}

	@Override
	public int getMaxMilis() {
		return maxMilis;
	}

	public void setMaxMilis(int maxMilis) {
		this.maxMilis = maxMilis;
	}
	
    @Override
	public List<Material> getMateriales() {
		return materiales;
	}


	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}


	public String toString() {
		return "Categoria nombre" + getCategoria() + "]";
	}

    @Override
	public Categoria getCategoriaPadre() {
		return categoriaPadre;
	}

	public void setCategoriaPadre(Categoria categoriaPadre) {
		this.categoriaPadre = categoriaPadre;
	}
	
    @Override
	public List<Categoria> getCategoriasHijas() {
		return categoriasHijas;
	}

	public void setCategoriasHijas(List<Categoria> categoriasHijas) {
		this.categoriasHijas = categoriasHijas;
	}



}