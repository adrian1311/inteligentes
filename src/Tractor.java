
public class Tractor {
private int col;
private int fil;
private int cantidadsobrante;

public Tractor(int col,int fil, int cantidadsobrante) {
	this.col=col;
	this.fil=fil;
	this.cantidadsobrante=cantidadsobrante;
}

public int getCol() {
	return col;
}

public void setCol(int col) {
	this.col = col;
}

public int getFil() {
	return fil;
}

public void setFil(int fil) {
	this.fil = fil;
}
public static void distribuir(int cantidad, int cantidadadecuada, int cantidadsobrante) {
	if (cantidad>cantidadadecuada) {
		cantidadsobrante=cantidad-cantidadadecuada;
		
	}
}

}
