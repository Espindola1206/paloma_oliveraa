package Menu;
import tools.*;
import Metodos.*;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;


public class test {
public static void main(String[] args) {
		
		menu1("Ordenado,Desordenado,Exit");
	}
	
	public static void menu(String menu1){
		String sel="";
		do{
				sel=boton(menu1);
				switch(sel){
				case "Knuth":
					char[] texto = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B', 'D'};
                    char[] patron = {'D', 'L', 'D'};
                    toolsList.imprimePantalla(Busquedas.imprimeOrdenados(texto));
                    toolsList.imprimePantalla("Patron a buscar:" + Busquedas.imprimeOrdenados(patron));
                    if(Busquedas.KMP(texto,patron)>=0)
                        toolsList.imprimePantalla("El patron existe");
                    else
                        toolsList.imprimePantalla("El patron no existe.");
					Knuth();
					break;
				case "Salto":
					int JS []= {10,13,15,26,28,50,56,88,94,127,159,356,480,567,689,699,780,850,956,995};
                    toolsList.imprimePantalla(Busquedas.imprimeOrdenados(JS));
                    if(Busquedas.jumpSearch(JS, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato existe");
                    else
                        toolsList.imprimePantalla("El dato no existe.");
					salto();
					break;
				case "Binario":
					int SB[] = {10,20,1,40,30};
                    toolsList.imprimePantalla(Busquedas.imprimeOrdenados(SB));
                    Arrays.sort(SB);
                    toolsList.imprimePantalla("Arreglo ordenado:"+Busquedas.imprimeOrdenados(SB));

                    if(Busquedas.secuencialBinaria(SB, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato no existe");
                    else
                        toolsList.imprimePantalla("El dato existe.");
					binario();
					break;
				case "Fibonacci":
					 int BF[] = {10,13,15,26,28,50,56,88,94,127,159,356,480,567,689,699,780};
	                    toolsList.imprimePantalla(Busquedas.imprimeOrdenados(BF));
	                    if(Busquedas.fibonacciSearch(BF, toolsList.leerInt("Numero a buscar:"))>=0)
	                        toolsList.imprimePantalla("El dato existe");
	                    else
	                        toolsList.imprimePantalla("El dato no existe.");
					fib();
					break;
				case "Exponencial":
					int[] EXP = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20,22,24,26};
                    toolsList.imprimePantalla(Busquedas.imprimeOrdenados(EXP));
                    if(Busquedas.busquedaExponencial(EXP, toolsList.leerInt("Numero a buscar:"))>=0)
                        toolsList.imprimePantalla("El dato existe");
                    else
                        toolsList.imprimePantalla("El dato no existe.");
					expo();
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu2(String menu1){
		String sel="";
		do {
				sel=boton(menu1);
				switch(sel){
				case "Interpolacion":
					 double[] ITP = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
					 double[] itp = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
	                    toolsList.imprimePantalla(Busquedas.imprimeOrdenados1(ITP));
	                    if(Busquedas.interpolacion(ITP,itp, toolsList.leerDouble("Numero a buscar:"))>=0)
	                        toolsList.imprimePantalla("El dato existe");
	                    else
	                        toolsList.imprimePantalla("El dato no existe.");
					interpolacion();
					break;
				case "Lineal":
					int SL[] = {1,2,3,4,5,6,7,8,9,10};
                    toolsList.imprimePantalla("Busqueda de un numero del 1 al 10.");
                    if(Busquedas.secuencialLineal(SL, toolsList.leerByte("Numero a buscar:")))
                        toolsList.imprimePantalla("El elemento existe");
                    else
                        toolsList.imprimePantalla("El elemento no existe");
					Lineal();
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu1(String menu){
		String Desordenado="Knuth,Salto,Binario,Fibonacci,Exponencial,Exit";
		String Ordenado = "Interpolacion,Lineal,Exit";
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Ordenado":
					menu(Ordenado);
					break;
				case "Desordenado":
					menu2(Desordenado);
					break;
				case "Exit":
					
					break;
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void Knuth() {
		Busquedas op = new Busquedas();
		
		String text = toolsList.leerString("Ingresa una cadena de texto");
		String buscar = toolsList.leerString("Que palabra de la cadena de texto quieres encontrar");
		
		int result = op.KMP(text,buscar);
		
		if(result != -1) {
			toolsList.imprimePantalla("La palabra : '"+buscar+"' esta a partir de la posicion: "+result);
		}else {
			toolsList.imprimeErrorMsg("Esta palabra no existe en el texto "+result);
		}
		
	}
	
	public static void interpolacion() {
		
		Busquedas op = new Busquedas();
		
		double[] x = {1.0, 2.0, 3.0, 4.0, 5.0, 7.0};
		double[] y = {10.0, 20.0, 30.0, 40.0, 50.0, 60.0};
		
		double xValue = 4.5;
		
		double ValorInter = op.interpolacion(x,y,xValue);
		
		if(ValorInter!=-1) {
			toolsList.imprimePantalla("Valor interpolado: "+ValorInter);
		}else {
			toolsList.imprimeErrorMsg("Este valor no se encontro");
		}
		
	}
	
	public static void salto() {
		
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		int r = Busquedas.jumpSearch(arr, x);
		
		if(r==-1) {
			toolsList.imprimeErrorMsg("El dato que buscas no se encuentra en la lista");
		}else {
			toolsList.imprimePantalla("El dato que buscas esta en la posicion: "+r);
		}
		
	}
	
	public static void binario() {
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		int r = Busquedas.busquedaBinaria(arr, x, x, x);
		
		if(r==-1) {
			toolsList.imprimeErrorMsg("El dato que buscas no se encuentra en la lista");
		}else {
			toolsList.imprimePantalla("El dato que buscas esta en la posicion: "+r);
		}
		
	}
	
	public static void fib() {
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		int r = Busquedas.fibonacciSearch(arr, x);
		
		if(r==-1) {
			toolsList.imprimeErrorMsg("El dato que buscas no se encuentra en la lista");
		}else {
			toolsList.imprimePantalla("El dato que buscas esta en la posicion: "+r);
		}
	}
	
	public static void expo() {
		int[] arr = {1, 5, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		int r = Busquedas.busquedaExponencial(arr, x);
		
		if(r==-1) {
			toolsList.imprimeErrorMsg("El dato que buscas no se encuentra en la lista");
		}else {
			toolsList.imprimePantalla("El dato que buscas esta en la posicion: "+r);
		}
	}
	
	public static void Lineal() {
		int[] arr = {1, 3, 4, 7, 9, 11, 13, 16, 19, 18, 20, 22, 24, 27, 30};
		int x = 13;
		
		boolean r = Busquedas.secuencialLineal(arr, x);
		
		if(r) {
			toolsList.imprimeErrorMsg("El dato que buscas no se encuentra en la lista");
		}else {
			toolsList.imprimePantalla("El dato que buscas se encuentra en la lista");
		}
	}
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return ( valores[n]);
	}
}