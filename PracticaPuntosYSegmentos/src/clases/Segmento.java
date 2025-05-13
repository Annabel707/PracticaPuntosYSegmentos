package clases;

public class Segmento {

	
	Punto a;
	Punto b;
	

/**
 * Crea un segmento con los puntos a y b especificados
 * @param a
 * @param b
 */
public Segmento (int a,int b ) {
	Punto p1 = new Punto(0,0);
	Punto p2 = new Punto(1,1);
	this.a=p1;
	this.b=p2;
}
/**
 * Crea un segmento con los puntos a y b especificados comprobando que los puntos no sean iguales
 * @param  
 * @param a
 * @param b
 */
public Segmento(Punto a, Punto b) {
	if(this.a==this.b) {
		throw new IllegalArgumentException("Los puntos deben ser diferentes");
	}else {
		this.a = a;
		this.b = b;
	}
	
}

	public void seta(Punto a) {
		this.a = a;
	}

	public void setb(Punto b) {
		this.b = b;
	}

	public Punto geta() {
		return this.a;
	}

	public Punto getb() {
		return this.b;
	}
	
	public String toString() {
		return "[ " + this.a + " , " + this.b + " ]";
	
}
	public Punto distancia() {
		return a;
	}
}
	

