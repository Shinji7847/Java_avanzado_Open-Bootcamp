package mediator;

public class SmartPhone_Builder {
	SmartPhone smartphone;
	
	public SmartPhone_Builder(String fabricante) {
		smartphone = new SmartPhone();
		smartphone.fabricante = fabricante;;
	}
	
	public SmartPhone_Builder setModelo(String modelo) {
		smartphone.modelo = modelo;
		return this;
	}
	
	public SmartPhone_Builder setCapacidad_memoria(String capacidad_memoria) {
		smartphone.capacidad_memoria = capacidad_memoria;
		return this;
	}
	
	public SmartPhone_Builder setCapacidad_bateria(int capacidad_bateria) {
		smartphone.capacidad_bateria = capacidad_bateria;
		return this;
	}

	public SmartPhone_Builder setAlto(double alto) {
		smartphone.alto = alto;
		return this;
	}

	public SmartPhone_Builder setAncho(double ancho) {
		smartphone.ancho = ancho;
		return this;
	}

	public SmartPhone_Builder setPeso(double peso) {
		smartphone.peso = peso;
		return this;
	}

	public SmartPhone_Builder setTactil(boolean tactil) {
		smartphone.tactil = tactil;
		return this;
	}

	public SmartPhone_Builder setPulg_pantalla(double pulg_pantalla) {
		smartphone.pulg_pantalla = pulg_pantalla;
		return this;
	}
	
	public SmartPhone build() {
		return this.smartphone;
	}
}
