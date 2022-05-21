package mediator;

public class SmartTV extends SmartDevice{
	public String fabricante;
	public String modelo;
	public String capacidad_memoria;
	public int pulg_pantalla;
	public double alto;
	public double ancho;
	public double peso;
	public boolean tactil;
	
	public SmartTV() {}

	@Override
	public String toString() {
		return "SmartTV [fabricante=" + fabricante + ", modelo=" + modelo + ", capacidad_memoria=" + capacidad_memoria
				+ ", alto=" + alto + ", ancho=" + ancho + ", peso=" + peso + ", tactil=" + tactil + "]";
	}

	@Override
	void recibe() {
		System.out.println("He recibido un mensaje. Soy SmartTV.");
	}

	@Override
	void envia() {
		System.out.println("Soy SmartTV. Envío un mensaje.");
		mediator.reenvia(this);
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCapacidad_memoria() {
		return capacidad_memoria;
	}

	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

	public double getPeso() {
		return peso;
	}

	public boolean isTactil() {
		return tactil;
	}
}
