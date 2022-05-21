package mediator;

public class SmartDeviceMain {
	
	/* Coloqué un patrón mediator en este proyecto SmartDevice 
	 * porque el uso de un mediador facilita el orden en la comunicación entre distintas clases.
	 * Utilizo patrón Builder para hacer más ágil la instanciación de los diversos objetos.
	 */

	public static void main(String[] args) {
		
		Mediator mediador = new MediadorConcreto();
		
		//SmartDevice motog100 = new SmartPhone("Motorola", "G100", "128gb", 5000, true, 6.7, 168.38, 73.97, 9.69);
		
		SmartDevice motog100 = new SmartPhone_Builder("Motorola")
				.setModelo("G100")
				.setCapacidad_memoria("128gb")
				.setCapacidad_bateria(5000)
				.setTactil(true)
				.setPulg_pantalla(6.7)
				.setAlto(168.38)
				.setAncho(73.97)
				.setPeso(9.69)
				.build();
		
		//SmartDevice smartband5 = new SmartWatch("Xiaomi", "MiBand5", "16mb", 125, true, true, 1.1, 12.4, 12.1);
		
		SmartDevice smartband5 = new SmartWatch_Builder("Xiaomi")
				.setModelo("MiBand5")
				.setCapacidad_memoria("16mb")
				.setCapacidad_bateria(125)
				.setTactil(true)
				.setPulsera_sport(true)
				.setAlto(1.1)
				.setAncho(18.5)
				.setPeso(12.1)
				.build();
		
		//SmartDevice smarttedge = new SmartTV("Tedge", "NTV43HD", "1.5gb", false, 43.0, 70.0, 120.0, 8.0);
		
		SmartDevice smarttedge = new SmartTV_Builder("Tedge")
				.setModelo("NTV43HD")
				.setCapacidad_memoria("1.5gb")
				.setTactil(false)
				.setPulg_pantalla(43)
				.setAlto(70)
				.setAncho(120)
				.setPeso(8)
				.build();
		
		System.out.println(motog100.toString());
		System.out.println(smartband5.toString());
		System.out.println(smarttedge.toString());
		
		System.out.println("*********************************************************");
		
		mediador.registra(motog100);
		mediador.registra(smarttedge);
		mediador.registra(smartband5);
		
		motog100.envia();
		smarttedge.envia();
	}

}
