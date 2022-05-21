package mediator;

public class SmartWatch_Builder {
	SmartWatch smartwatch;
		
		public SmartWatch_Builder(String fabricante) {
			smartwatch = new SmartWatch();
			smartwatch.fabricante = fabricante;
		}
		
		public SmartWatch_Builder setModelo(String modelo) {
			smartwatch.modelo = modelo;
			return this;
		}
		
		public SmartWatch_Builder setCapacidad_memoria(String capacidad_memoria) {
			smartwatch.capacidad_memoria = capacidad_memoria;
			return this;
		}
		
		public SmartWatch_Builder setCapacidad_bateria(int capacidad_bateria) {
			smartwatch.capacidad_bateria = capacidad_bateria;
			return this;
		}

		public SmartWatch_Builder setAlto(double alto) {
			smartwatch.alto = alto;
			return this;
		}

		public SmartWatch_Builder setAncho(double ancho) {
			smartwatch.ancho = ancho;
			return this;
		}

		public SmartWatch_Builder setPeso(double peso) {
			smartwatch.peso = peso;
			return this;
		}

		public SmartWatch_Builder setTactil(boolean tactil) {
			smartwatch.tactil = tactil;
			return this;
		}

		public SmartWatch_Builder setPulsera_sport(boolean pulsera_sport) {
			smartwatch.pulsera_sport = pulsera_sport;
			return this;
		}
		
		public SmartWatch build() {
			return this.smartwatch;
		}
}
