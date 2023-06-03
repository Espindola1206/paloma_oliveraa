package estructuranolineal;

import javax.swing.JOptionPane;

import Doble_Liga.Nodito;
import Tools.ToolsPanel;

public class TestArbol {

	public static void main(String[] args) {
		menu0("Insertar,Recorridos,Eliminar nombre,Exit");
	}
	
	public static void menu0(String menu){  
		ArbolBin<String> arb;
		arb = new ArbolBin();
		String sel="";
		do {
				sel=boton(menu);
				switch(sel){
				case "Insertar": 
					arb.insertarArbol(ToolsPanel.leerString("Inserte un nombre"));
					break;
				case "Recorridos":  
					ToolsPanel.imprimePantalla("PreOrden: "+arb.preorden(arb.getRaiz())
					+"\nInOrden1: "+arb.inorden(arb.getRaiz())
					+"\nInOrden2: "+arb.inorden2(arb.getRaiz())
					+"\nPosOrden: "+arb.posorden(arb.getRaiz()));
					break;
			
				case "Exit":
					
					break;
				case "eliminiar ":  
					ToolsPanel.imprimePantalla("Eliminar hoja: "+arb.Hojas(arb.getRaiz()));
break;
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
