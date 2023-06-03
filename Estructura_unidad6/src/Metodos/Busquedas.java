package Metodos;

public class Busquedas {
    public static boolean secuencialLineal(int a[], int valor){
        boolean existe=false;

        for (int i = 0;i<a.length;i++){
            if(valor==a[i])
                existe = true;
        }

        return existe;

    }

    public static int secuencialBinaria(int[] a, int valor){

        int inf = 0;
        int sup = a.length-1;
        int mitad = 0;

        while (inf <= sup){
            mitad = (inf+sup)/2;
            if (valor == a[mitad]){
                return mitad;
            }
            else if (valor < a[mitad]){
                inf = mitad+1;
            }
            else if (valor > a[mitad]){
                sup = mitad-1;
            }
        }
        return -1;
    }
    public static int KMP(char[] texto, char[] patron) {
        int n = texto.length();
        int m = patron.length();
        int[] lps = new int[m];
        int tam = 0;
        int i = 1;
        lps[0] = 0;
        while (i < m) {
            if (patron.charAt(i).equals(patron.charAt(tam)) {
                tam++;
                lps[i] = tam;
                i++;
            } else {
                if (tam != 0) {
                    tam = lps[tam - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        int j = 0;
        for (i = 0; i < n; ) {
            if (patron.equals(j) == texto.charAt(i)) {
                j++;
                i++;
            }
            if (j == m) {
                return i - j;
            } else if (i < n && patron.charAt(j) != texto.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    public static int jumpSearch(int a[], int valor){
        int inicio = 0;
        int fin = a.length;
        int tbloque = (int)Math.sqrt(a.length);

        while(a[fin-1]<=valor && fin<a.length) {
            inicio = fin;
            fin = fin+tbloque;
            if(fin>a.length-1)
                fin = a.length;
        }

        for (int i = inicio;i<fin;i++){
            if(a[i]==valor)
                return i;
        }
        return -1;
    }

    public static double interpolacion(double[]x, double [] y, double xValue) {
    	int n=x.length;
    	for(int i=0; i<n-1;i++) {
    		if (x[i]<=xValue && xValue <= x[i+1]) {
    			double yValue=y[i] + (y[i+1]- y[i])*(xValue-x[i]) / (x[i+1]- x[i]);
         return yValue;
            }
        }
        return -1;
    }

    public static int busquedaExponencial(int[] a, int valor) {
        int tamaño = a.length;
        if (a[0] == valor) {
            return 0;
        }

        int i = 1;
        while (i < tamaño  && a[i] <= valor) {
            i *= 2;
        }

        return busquedaBinaria(a, valor, i / 2, Math.min(i, tamaño - 1));
    }

    public static int busquedaBinaria(int[] a, int clave, int inicio, int fin) {
        if (fin >= inicio) {
            int medio = inicio + (fin - inicio) / 2;

            if (a[medio] == clave) {
                return medio;
            }

            if (a[medio] > clave) {
                return busquedaBinaria(a, clave, inicio, medio - 1);
            }

            return busquedaBinaria(a, clave, medio + 1, fin);
        }

        return -1;
    }

    public static int fibonacciSearch(int[] a, int target) {
        int n = a.length;
        int fib2 = 0;
        int fib1 = 1;
        int fib = fib2 + fib1;
        //calcular fibonacci
        while (fib < n) {
            fib2 = fib1;
            fib1 = fib;
            fib = fib2 + fib1;
        }
        int dif = -1;
        while (fib > 1) {
           int i = Math.min(dif + fib2, n - 1);
            if (a[i] < target) {
                fib = fib1;
                fib1 = fib2;
                fib2 = fib - fib1;
                dif = i;
            }
            else
                if (a[i] > target) {
                    fib = fib2;
                    fib1 = fib1 - fib2;
                    fib2 = fib - fib1;
            }
            else {
                return i;
            }
        }
        if (fib1 == 1 && a[dif + 1] == target) {
            return dif + 1;
        }

       return -1;
    }

    public static String imprimeOrdenados(int a[]) {
        String cad="";
        for (int i = 0; i<a.length; i++)
        {
            cad += i+"[" + a[i]+"]" +"\n";
        }
        return "\n" + cad;
    }

    public static String imprimeOrdenados(char a[]) {
        String cad="";
        for (int i = 0; i<a.length; i++)
        {
            cad += "[" + a[i]+"]";
        }
        return "\n" + cad;
    }
    public static String imprimeOrdenados1(double []a) {
        String cad="";
        for (int i = 0; i<a.length; i++)
        {
            cad += "[" + a[i]+"]";
        }
        return "\n" + cad;
    }

    public int KMP(String text, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
