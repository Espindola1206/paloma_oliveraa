package Pila_Estatica;
	
public interface Pila_TDA<T>{
	
	public boolean isEmpty();
	
	public T pop();
	
	public void push(T dato);
	
	public T peek();
	
	public void freePila();
	
}