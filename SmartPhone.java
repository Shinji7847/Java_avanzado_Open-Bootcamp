package mediator;

public class SmartPhone extends SmartDevice{
	
	public String fabricante;
	public String modelo;
	public String capacidad_memoria;
	public int capacidad_bateria;
	public double alto;
	public double ancho;
	public double peso;
	public boolean tactil;
	public double pulg_pantalla;

	public SmartPhone() {}
	
	@Override
	public String toString() {
		return "SmartPhone [fabricante=" + fabricante + ", modelo=" + modelo + ", capacidad_memoria="
				+ capacidad_memoria + ", capacidad_bateria=" + capacidad_bateria + ", alto=" + alto + ", ancho=" + ancho
				+ ", peso=" + peso + ", pulg_pantalla=" + pulg_pantalla + ", tactil=" + tactil + "]";
	}

	@Override
	void recibe() {
		System.out.println("He recibido un mensaje. Soy SmartPhone.");
	}

	@Override
	void envia() {
		System.out.println("Soy SmartPhone. Envío un mensaje.");
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

	public double getPulg_pantalla() {
		return pulg_pantalla;
	}
}
