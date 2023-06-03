package Ordenamientos;

import Tools.ToolsPanel;
/*/EQUIPO 4: 
 * ARIEL HERNANDEZ DIAZ
 * CELESTE VELAZQUEZ SARMIENTO
 * XIMENA MONTSERRAT PALACIOS MENDEZ
 * PALOMA ESPINDOLA OLIVERA
 */

public class Ordenamientos_M<T> implements Metodos_TDA<T> {
    private byte p,tam;
    private int datos[];

    public Ordenamientos_M(byte tam){
        datos = new int[tam];
        p=-1;
        this.tam = tam;
    }

    @Override
    public boolean arrayVacio() {
        return (p==-1);
    }

    @Override
    public boolean espacioArray() {
        return (p<=tam);
    }

    @Override
    public void vaciarArray() {
        datos = new int[tam];
        p=-1;
    }

    @Override
    public void almacenaAleatorios() {
        for(int i =0; i<datos.length;i++){
            datos[i] = generaRandom(1, 10);
            p++;
        }
    }
    public void almacenaDatos() {
    	 if(p< datos.length)
	        {
	            datos[p+1] = ToolsPanel.leerInt("Escribe un numero");
	            p++;
	        }
	        else
	            ToolsPanel.imprimeErrorMsje("Arreglo Lleno.");
    }

    @Override
    public String imprimeDatos() {
        String cad="";
        for (int i = 0; i<=p; i++){
            cad+= i+"=>[" + datos[i] + "]" + "\n";
        }
        return "\n" + cad;
    }

    @Override
    public void burbujaSeñal() {
        boolean band;
        int vueltas = 0;
        for (int i = 0; i < datos.length - 1; i++) {
            band = false;
            for (int j = 0; j < datos.length - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                    band = true;
                    vueltas++;
                }
            }
            if (!band) 
                break;
        }
        ToolsPanel.imprime("Vueltas: "+vueltas);
    }
    @Override
    public void dobleBurbuja() {
        boolean band;
        for (int i = 0; i < datos.length / 2; i++) {
            band = false;
            for (int j = i; j < datos.length - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                    band = true;
                }
            }
            if (!band) {
                break;
            }
            band = false;
            for (int j = datos.length - i - 2; j > i; j--) {
                if (datos[j] < datos[j - 1]) {
                    int temp = datos[j];
                    datos[j] = datos[j - 1];
                    datos[j - 1] = temp;
                    band = true;
                }
            }
            if (!band) {
                break;
            }
        }
    }

        
    @Override
    public void inserDirecta() {
        for (int i = 1; i < datos.length; i++) {
            int wiss = datos[i]; int x = i - 1;
            while (x >= 0 && datos[x] > wiss) {
                datos[x + 1] = datos[x];
                x--;
            }
            datos[x + 1] = wiss;
        }
    }

    @Override
    public void binaria() {
        for (int i = 1; i < datos.length; i++) {
            int temp = datos[i],j = i - 1;
            while (j >= 0 && datos[j] > temp) {
                datos[j + 1] = datos[j];
                j--;
            }
            datos[j + 1] = temp;
        }
    }
    @Override
    public void shellIncreDecre() {
        int a = datos.length / 2;
        while (a > 0) {
            for (int i = a; i < datos.length; i++) {
                int tm = datos[i], x = i;
                while (x >= a && datos[x - a] > tm) {
                    datos[x] = datos[x - a];
                    x -= a;
                }
                datos[x] = tm;
            }
            a/= 2;
        }
    }
    @Override
    public void heapSort() {
        for (int i = datos.length / 2 - 1; i >= 0; i--) {
        	heapSort2(datos, datos.length, i);
        }
        for (int i = datos.length - 1; i > 0; i--) {
            int tp = datos[0];
            datos[0] = datos[i];
            datos[i] = tp;
            heapSort2(datos, i, 0);
        }
    }
    public static void heapSort2(int datos[], int tamaño, int pivote) {
        int l_izq = 2 * pivote + 1;
        int l_der = 2 * pivote + 2;
        int alto = pivote;
        if (l_izq < tamaño && datos[l_izq] > datos[alto]) {
            alto = l_izq;
        }
        if (l_der < tamaño && datos[l_der] > datos[alto]) {
            alto = l_der;
        }
        if (alto != pivote) {
            int temp = datos[pivote];
            datos[pivote] = datos[alto];
            datos[alto] = temp;
            heapSort2(datos, tamaño, alto);
        }
    }

    @Override
    public void quicksortRecursivo() {
    	quicksort2(datos, 0, datos.length - 1);
    }

    

    public static void quicksort2(int[] datos, int min, int max) {
    	int pivote = datos[min];
        
        int i = min; 
        int j = max; 
        int aux;
       
        while(i<j)
        {
           while (datos[i] <= pivote && i < j) 
              i++;

           while (datos[j] > pivote) 
              j--;   

           if (i<j) 
           {                                     
               aux = datos[i];                  
               datos[i]= datos[j];
               datos[j]=aux;
           }
        }

         datos[min] = datos[j]; 
         datos[j] = pivote;

         if (min < j-1)
        	 quicksort2(datos,min,j-1);

         if (j+1 < max)
        	 quicksort2(datos,j+1,max);
    }

    @Override
    public void radix() {
        int may = getMax(datos);
        int oppo = 1;
        while (may / oppo > 0) {
        	countSort(datos, oppo);
        	oppo *= 10;
        }
    }
    @Override
    public void seleDirecta() {
        for (int i = 0; i < datos.length - 1; i++) {
            int Min = i;
            for (int x = i + 1; x < datos.length; x++) {
                if (datos[x] < datos[Min]) {
                	Min = x;
                }
            }
            int tp = datos[Min];
            datos[Min] = datos[i];
            datos[i] = tp;
        }
    }

    public static void countSort(int[] datos, int ter) {
    	  int n = datos.length;
          int[] output = new int[n];
          int[] count = new int[10];
          for (int num : datos) {
              count[(num / ter) % 10]++;
          }
          for (int i = 1; i < 10; i++) {
              count[i] += count[i - 1];
          }
          for (int i = n - 1; i >= 0; i--) {
              output[count[(datos[i] / ter) % 10] - 1] = datos[i];
              count[(datos[i] / ter) % 10]--;
          }
          System.arraycopy(output, 0, datos, 0, n);
      }

      public static int getMax(int[] datos) {
          int max = datos[0];
          for (int num : datos) {
              if (num > max) {
                  max = num;
              }
          }
          return max;
      }

    @Override
    public void intercalacion() {
        int n = datos.length;
        
        if (n < 2) {
            return;
        }
        
        for (int i = 1; i < n; i++) {
            int elemento = datos[i];
            int j = i - 1;
            
            while (j >= 0 && datos[j] > elemento) {
                datos[j + 1] = datos[j];
                j--;
            }
            
            datos[j + 1] = elemento;
        }
    }
    
    @Override
    public void mezclaDirecta() {
        mezcla2(datos);
    }
    
    public static int[] mezcla2(int datos[]) {
        int i,j,k;
       if(datos.length>1) {
    	   int izq = datos.length/2;
    	   int der = datos.length - izq;
    	   int arregloIzq[]= new int [izq];
    	   int arregloDer[]= new int [der];
    	   
    	   for(i=0; i<izq; i++ ) {
    		   arregloIzq[i]=datos[i];
    	   }
    	   for(i = izq; i<izq+der;i++) {
    		   arregloDer[i-izq]=datos[i];
    	   }
    	   arregloIzq= mezcla2(arregloIzq);
    	   arregloDer=mezcla2(arregloDer);
    	   
    	   i = 0;
    	   j = 0;
    	   k = 0;
    	   
    	   while (arregloIzq.length !=j && arregloDer.length !=k ) {
    		   if (arregloIzq[j]<arregloDer[k]) {
    			   datos[i]=arregloIzq[j];
    			   i++;
    			   j++;
    		   }else {
    			   datos[i]=arregloDer[k];
    			   i++;
    			   k++;
    		   }
    	   }
    	   while (arregloIzq.length !=j) {
    		   datos[i]=arregloIzq[j];
    		   i++;
    		   j++;
    	   }
    	   while (arregloDer.length !=k) {
    		   datos[i]=arregloDer[k];
    		   i++;
    		   k++;
    	   }
       }
       return datos;
    }
    
    @Override
    public int generaRandom(int min, int max) {
        return (int)((max - min + 1) * Math.random()+ min);
    }
	@Override
	public void mezclaNatural() {
		int izquierda = 0, izq = 0, derecha = datos.length -1, der = derecha;
	boolean band = false;
	do {
		band = true;
		izquierda = 0;
		
		while (izquierda<derecha ) {
			izq = izquierda;
			while(izq < derecha && datos[izq] <= datos[izq+1]) {
				izq++;
			}
			der = izq +1;
			while(der == derecha-1 || der<derecha && datos[der]<=datos[der+1]) {
				der++;
			}
			if (der<=derecha) {
				mezcla2(datos);
				band = false;
			}
			izquierda = izq;
		}
	}while(!band);
	
	}
}
