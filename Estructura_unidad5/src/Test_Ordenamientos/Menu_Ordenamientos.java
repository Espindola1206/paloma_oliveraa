package Test_Ordenamientos;

import javax.swing.JOptionPane;

import Ordenamientos.Ordenamientos_M;
import Tools.ToolsPanel;

public class Menu_Ordenamientos {
	 public static void menu3(String menu)
	    {
		 Ordenamientos_M <Integer> ordena = new Ordenamientos_M<Integer>((byte)10);
	        
	        String sel="";
	      
	        do {
	            sel=desplegable(menu);
	            switch(sel){
	                case "Insertar":
	                	if(!ordena.espacioArray()) ToolsPanel.imprimeErrorMsje("Esta lleno el arreglo!!");
	                    else ordena.almacenaAleatorios();
                        ToolsPanel.imprime("DATOS ALEATORIOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    break;
	                case "Inserta Prueba":
	                	if(!ordena.espacioArray()) ToolsPanel.imprimeErrorMsje("Esta lleno el arreglo!!");
	                    else ordena.almacenaDatos();
                        ToolsPanel.imprime("DATOS ALEATORIOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    break;
	                case "Imprimir":
	                	if(ordena.arrayVacio()) ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else ToolsPanel.imprime("DATOS ALEATORIOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    break;
	                case "Vaciar":
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else ordena.vaciarArray();
	                break;
	                
	                case "Seleccion Directa":
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.seleDirecta();ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());}
	                break;
	                
	                case "HeapSort":
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.heapSort();
	                    ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Insercion Directa":
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.inserDirecta();
	                    ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());}   
	                break;
	                case "Binaria":
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.binaria();ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());  } 
	                break;
	                case "QuickSortRecursivo":
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.quicksortRecursivo();
	                        ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Radix":
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.radix();
	                        ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Mezcla Natural":
	                	if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.mezclaNatural();
	                        ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;
	                case "Intercalacion":
	                	if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.intercalacion();
	                        ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break; 
	                case "Burbuja Señal":
	                	if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
                        ordena.burbujaSeñal();
                        ToolsPanel.imprime("DATOS ORDENADOS DEL ARREGLO:\n"+ordena.imprimeDatos());
	                    }
                    break;
                    case "Doble Burbuja": 
                    	if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
                    	ordena.dobleBurbuja();
                    	ToolsPanel.imprime("DATOS ORDENADOS DEL ARREGLO:\n"+ordena.imprimeDatos());
	                    }
                    break;
                    case "Mezcla Directa":
                    	if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else { 
	                    	ordena.mezclaDirecta();
	                        ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());
	                    }
	                break;    
                    case "Shell": 
	                    if(ordena.arrayVacio())ToolsPanel.imprimeErrorMsje("Arreglo vacio!!");
	                    else {ordena.shellIncreDecre(); ToolsPanel.imprime("DATOS ALEATORIOS ORDENADOS DEL ARREGLO\n"+ordena.imprimeDatos());}
	                break;
	                case "Salir": 
	                	ToolsPanel.imprime("Fin del programa");  
	                break;
	            }
	        }while(!sel.equalsIgnoreCase("Salir"));
	    }
	    public static void main(String[] args) {
	        String menu = "Insertar,Inserta Prueba,Imprimir,Vaciar,Seleccion Directa,HeapSort,Insercion Directa,Binaria,QuickSortRecursivo,Radix,Mezcla Natural,Intercalacion,Burbuja Señal,Doble Burbuja,Mezcla Directa,Shell,Salir";
	        menu3(menu);
	    }
	    public static String boton(String menu) {
	        String valores[]=menu.split(",");
	        int n;
	        n = JOptionPane.showOptionDialog(null," SELECCIONA DANDO CLICK ", " M E N U",
	                JOptionPane.NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,null,
	                valores,valores[0]);
	        return ( valores[n]);
	    }      
	    public static String desplegable(String menu) {
	        String valores[]=menu.split(",");
	        String res=
	                (String)JOptionPane.showInputDialog(null,"M E N U","Selecciona opcion:",
	                        JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
	        return(res);
	    }
	    
}