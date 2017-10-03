import java.util.*;

public class Principal {

	public static void main (String [] args) {
		int numero1=0;
		int numero2=0,cantadecuada=0,total=0,postractor1=0,postractor2=0,totalcasillas= 0,cantidad = 0,opcion = 0;
		Scanner leer = new Scanner(System.in);
		do {
		System.out.println("Eligen una opcion: ");
		System.out.println("1 : leer datos por teclado ");
		System.out.println("2 : leer datos desde fichero");
		opcion=leer.nextInt();
		
			switch (opcion) {
			case 1:
				System.out.println("Introduce numero de filas");
				numero1= leer.nextInt();
				System.out.println("Introduce numero de columnas");
				numero2= leer.nextInt();
				totalcasillas=numero1*numero2;
				System.out.println("Introduce la cantidad adecuada por casilla entre 1-8  ");
				cantadecuada=leer.nextInt();
				do {
					System.out.println("Introduce x del tractor");
					postractor1= leer.nextInt();
					System.out.println("Introduce y del tractor");
					postractor2= leer.nextInt();
					}
					while(postractor1>numero1 || postractor2>numero2);
				break;
			case 2:
				
				break;
			default:
				System.out.println("Introduce una opcion valida");
			    break;
			}
		}while (opcion > 2);
		
		
		Casilla [][] tablero = new Casilla [numero1][numero2];		
		Tractor tractor = new Tractor( postractor1, postractor2, totalcasillas);
		total=cantadecuada*totalcasillas;;
		// Bucle para que la cantidad del tablero sea exacta
		int suma=0;
		do {
		suma=0;
		for (int x=0; x < tablero.length; x++) {
			  for (int y=0; y < tablero[x].length; y++) {
				  cantidad=(int) (Math.random()*7+1);
			    tablero[x][y]= new Casilla(x, y, cantidad, false,cantadecuada);
			    suma=suma+tablero[x][y].getcantidad();
			  }
		}
			}while(suma!=total);
		for (int x=0; x < tablero.length; x++) {
			  for (int y=0; y < tablero[x].length; y++) {
			   System.out.print(tablero[x][y].getcantidad()); 
			  }
			 }
	}
}
	
