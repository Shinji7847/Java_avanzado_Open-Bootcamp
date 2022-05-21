package mediator;

public class SmartWatch extends SmartDevice {
	public String fabricante;
	public String modelo;
	public String capacidad_memoria;
	public int capacidad_bateria;
	public boolean pulsera_sport;
	public double alto;
	public double ancho;
	public double peso;
	public boolean tactil;
	
	public SmartWatch() {}
	
	@Override
	public String toString() {
		return "SmartWatch [fabricante=" + fabricante + ", modelo=" + modelo + ", capacidad_memoria="
				+ capacidad_memoria + ", capacidad_bateria=" + capacidad_bateria + ", pulsera_sport=" + pulsera_sport
				+ ", alto=" + alto + ", ancho=" + ancho + ", peso=" + peso + ", tactil=" + tactil + "]";
	}

	@Override
	void recibe() {
		System.out.println("He recibido un mensaje. Soy SmartWatch.");
	}

	@Override
	void envia() {
		System.out.println("Soy SmartWatch. Envío un mensaje.");
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

	public int getCapacidad_bateria() {
		return capacidad_bateria;
	}

	public boolean isPulsera_sport() {
		return pulsera_sport;
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