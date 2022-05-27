package open_bootcamp;

public class Cliente extends Persona {

	private String snombre;
	private int iedad;
	private String snumTelefonico;
	private double dcredito;
	private boolean aplicaADescuento = false;
	private double dmontoCompraActual = 0;

		public void setNombre(String nombre) {
			snombre = nombre;
		}
		
		public String getDatosCliente() {
			return "El cliente " + snombre + " tiene una edad de " + iedad + " años, su télefono es " + snumTelefonico +
					" y su capacidad de credito es $" + dcredito + "." + "¿El cliente aplica a un descuento?: " + aplicaADescuento
					+ ". El monto de compra actual es: " + dmontoCompraActual;
		}
		
		public void setEdad(int edad) {
			iedad = edad;
		}
		
		public void setTelefono(String numTelefonico) {
			snumTelefonico = numTelefonico;
		}
		
		public void setCredito(double cuantoCredito) {
			dcredito = cuantoCredito;
		}

		public String aplicarDescuento(double cuantoDescuento, double dmontoCompra){
			double resultado = 0;
			dmontoCompraActual = dmontoCompra;

			if(aplicaADescuento) {
				resultado = dmontoCompra * 100 / cuantoDescuento;

				return "El monto de la compra luego del descuento es: " + resultado;
			}

			return "El cliente no aplica a un descuento";
		}
}
