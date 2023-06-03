
package Ejecutar;

import javax.swing.JOptionPane;

import Colas.ColaA;
import Memoria_dinamica.PilaC;
import Pila_Estatica.PilaA;
import Pila_Estatica.PilaB;
import Tools.ToolsPanel;

public class Iniciar {

	public static void main(String[] args) {
		menu2("Push,Pop,Peek,Free,Mostrar");
		menu3("Push,Pop,Peek,Free,Mostrar");
		menu4("Push,Pop,Peek,Free,Mostrar");
		menu5("Push,Pop,Peek,Free,Mostrar");
	}
	
	
	public static void menu2(String menu){  
		PilaC<Integer> pila = new PilaC();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Push": pila.push(ToolsPanel.leerInt("Ingresa un dato")); ;break;
				
				case "Pop": if(pila.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia"); else ToolsPanel.imprimePantalla("Dato eliminado de la pila"+pila.pop()); ;break;
				
				case "Peek": 
					if(pila.isEmpty()) ToolsPanel.imprimeError("la pila esta vacia");
					else
						ToolsPanel.imprimePantalla("Dato de la sima de la pila: "+pila.peek());
					;break;
				
				case "Free": 
					if(pila.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia ");
					else
						pila.vaciar();
						ToolsPanel.imprimeError("La pila esta vacia...");
					break;
				
				case "Mostrar": if(pila.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia ");
				else
					ToolsPanel.imprimePantalla(pila.toString()) ;break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu3(String menu){  
		ColaA<Integer> ColaA = new ColaA((byte)10);
		PilaB<Integer> pilaB = new PilaB();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Push": ColaA.pushCola(ToolsPanel.leerInt("Ingresa un dato")); ;break;
				
				case "Pop": if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("La pila esta vacia"); else ToolsPanel.imprimePantalla("Dato eliminado de la pila"+ColaA.popCola()); ;break;
				
				case "Peek": 
					if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("La pila esta vacia ");
					else
						ToolsPanel.imprimePantalla("Dato de la sima de la cola: "+ColaA.peekCola());
					;break;
				
				case "Free": 
					if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("La pila esta vacia ");
					else
						ColaA.freeCola();
						ToolsPanel.imprimeError("La pila esta vacia...");
					break;
				
				case "Mostrar": if(ColaA.isEmptyCola()) ToolsPanel.imprimeError("La pila esta vacia");
				else
					ToolsPanel.imprimePantalla(ColaA.toString()) ;break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu4(String menu){  
		PilaA<Integer> pila = new PilaA((byte)10);
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Push": pila.push(ToolsPanel.leerInt("Ingresa un dato")); ;break;
				
				case "Pop": if(pila.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia"); else ToolsPanel.imprimePantalla("Dato eliminado de la pila"+pila.pop()); ;break;
				
				case "Peek": 
					if(pila.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia");
					else
						ToolsPanel.imprimePantalla("Dato de la sima de la cola: "+pila.peek());
					;break;
				
				case "Free": 
					if(pila.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia");
					else
						pila.freePila();
						ToolsPanel.imprimeError("La pila esta vacia...");
					break;
				
				case "Mostrar": if(pila.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia");
				else
					ToolsPanel.imprimePantalla(pila.toString()) ;break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static void menu5(String menu){  
		PilaB<Integer> pilaB = new PilaB();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Push": pilaB.push(ToolsPanel.leerInt("Ingresa un dato")); break;
				
				case "Pop": if(pilaB.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia"); else ToolsPanel.imprimePantalla("Dato eliminado de la pila"+pilaB.pop()); ;break;
				
				case "Peek": 
					if(pilaB.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia");
					else
						ToolsPanel.imprimePantalla("Dato de la sima de la cola: "+pilaB.peek());
					;break;
				
				case "Free": 
					if(pilaB.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia");
					else
						pilaB.freePila();
						ToolsPanel.imprimeError("La pila esta vacia...");
					break;
				
				case "Mostrar": if(pilaB.isEmpty()) ToolsPanel.imprimeError("La pila esta vacia");
				else
					ToolsPanel.imprimePantalla(pilaB.toString()) ;break;
				
				case "Exit": ;break;
				
				}//switch
		}while(!sel.equalsIgnoreCase("Exit"));
	}
	
	public static String boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n = JOptionPane.showOptionDialog(null,"SELECCIONA  DANDO CLICK ", " M E N U", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return ( valores[n]);
	}
	
}
        
  