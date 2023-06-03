package Operaciones;

import Memoria_Dinamica.Nodo;

public interface Opera_TDA<T> {

	public void insertarFrente(T dato);
	
	public void insertarFinal(T dato);
	
	public boolean isListaVacia();
	
	public Nodo buscarLista(T dato);
	
	public void Eliminar(Nodo dato);
	
	public void Modificar(Nodo dato);
	
	public String mostrarLista();
	
}
