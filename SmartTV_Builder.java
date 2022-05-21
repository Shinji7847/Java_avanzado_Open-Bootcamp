package mediator;

public class SmartTV_Builder {
SmartTV smarttv;
	
	public SmartTV_Builder(String fabricante) {
		smarttv = new SmartTV();
		smarttv.fabricante = fabricante;
	}
	
	public SmartTV_Builder setModelo(String modelo) {
		smarttv.modelo = modelo;
		return this;
	}
	
	public SmartTV_Builder setCapacidad_memoria(String capacidad_memoria) {
		smarttv.capacidad_memoria = capacidad_memoria;
		return this;
	}
	
	public SmartTV_Builder setAlto(double alto) {
		smarttv.alto = alto;
		return this;
	}

	public SmartTV_Builder setAncho(double ancho) {
		smarttv.ancho = ancho;
		return this;
	}

	public SmartTV_Builder setPeso(double peso) {
		smarttv.peso = peso;
		return this;
	}

	public SmartTV_Builder setTactil(boolean tactil) {
		smarttv.tactil = tactil;
		return this;
	}

	public SmartTV_Builder setPulg_pantalla(int pulg_pantalla) {
		smarttv.pulg_pantalla = pulg_pantalla;
		return this;
	}
	
	public SmartTV build() {
		return this.smarttv;
	}
}
