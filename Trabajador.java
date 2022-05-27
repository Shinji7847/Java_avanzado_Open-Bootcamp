package open_bootcamp;

public class Trabajador extends Persona {
	
	private String snombre;
	private int iedad;
	private String snumTelefonico;
	private double dsalario;

		public void setNombre(String nombre) {
			snombre = nombre;
		}
		
		public String getDatosTrabajador() {
			return "El trabajador " + snombre + " tiene una edad de " + iedad + " años, su télefono es " + snumTelefonico +
					" y su salario es $" + dsalario + ".";
		}
		
		public void setEdad(int edad) {
			iedad = edad;
		}
		
		public void setTelefono(String numTelefonico) {
			snumTelefonico = numTelefonico;
		}
		
		public void setSalario(double cuantoSalario) {
			dsalario = cuantoSalario;
		}
		
		public void subirSalario(double porcentaje) {
			double aumento = dsalario * porcentaje/100;
			dsalario += aumento;
		}

}
