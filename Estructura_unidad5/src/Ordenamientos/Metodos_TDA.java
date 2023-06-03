package Ordenamientos;

public interface Metodos_TDA<T> {
	public boolean arrayVacio();
	public boolean espacioArray();
	public void vaciarArray();
	public void almacenaAleatorios();
	public String imprimeDatos();
	public void burbujaSeñal();
	public void dobleBurbuja();
	public void shellIncreDecre();
	public void seleDirecta();
	public void inserDirecta();
	public void binaria();
	public void heapSort();
	public void radix();
	public void intercalacion();
	public void mezclaDirecta();
	public void mezclaNatural();
	public int generaRandom(int min, int max);
	public void quicksortRecursivo();
}
