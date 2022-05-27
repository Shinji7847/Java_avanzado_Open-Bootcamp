package open_bootcamp;

/* Enunciado del ejercicio: 
 * Crear clase Persona con las variables edad, nombre y telefono.
 * Crea una nueva clase Cliente que herede de Persona. Esta nueva clase solo tendrá la variable credito.
 * Crear un objeto de la clase Cliente con todas las propiedades correspondientes.
 * Darles valor y mostrar por pantalla dichas propiedades.
 * Una vez hecho esto haz lo mismo con la clase Trabajador que herede de Persona y con una variable Salario
  */

/* Enunciado ejercicio sesión 14:
* Siguiendo las normas de nombrado de la sesión 12, diseña dos funciones limpias.
* Teniendo en cuenta lo visto en la sesión 14, comenta uno de los proyectos sobre los que hayas trabajado en el curso,
* si ya contenían comentarios y has detectado algún comentario sobrante, confuso, redundante o mal descrito, indícalo
 */

public class Persona {

	//TODO Transformar la clase Persona en abstracta e instanciar todo en una nueva clase Main
	//TODO Evaluar la posibilidad de usar patrón Builder
	//TODO Implementar estructuras de datos(p. ej. ArrayList) para almacenar tanto clientes como trabajadores

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		persona1.setNombre("Juan Valverde");
		System.out.println("El nombre de la persona1 es: " + persona1.getNombre());
		persona1.setEdad(25);
		System.out.println("La edad de la persona1 es: " + persona1.getEdad() + " años");
		persona1.setTelefono("+911245232542");
		System.out.println("El número telefonico de la persona1 es: " + persona1.getTelefono());

		System.out.println("*****************************************************************");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Juan Hernandez");
		cliente1.setEdad(25);
		cliente1.setTelefono("+911245232542");
		cliente1.setCredito(5000);
		System.out.println(cliente1.getDatosCliente());

		System.out.println("*****************************************************************");

		Trabajador trabajador1 = new Trabajador();
		trabajador1.setNombre("Carlos Eduardo Alvarez");
		trabajador1.setEdad(35);
		trabajador1.setTelefono("+911245235544");
		trabajador1.setSalario(15000);
		
		System.out.println(trabajador1.getDatosTrabajador());
		
		trabajador1.subirSalario(5);
		System.out.println("Nuevo registro sobre el trabajador1: " + trabajador1.getDatosTrabajador());
	
	}
	
	private String snombre;
	private int iedad;
	private String snumTelefonico;
	
	
	//Setter
	public void setNombre(String nombre) { 
		snombre = nombre;
	}
	
	//Getter
	public String getNombre() { 
		return snombre;
	}
	
	public void setEdad(int edad) {
		iedad = edad;
	}
	
	public int getEdad() {
		return iedad;
	}
	
	public void setTelefono(String numTelefonico) {
		snumTelefonico = numTelefonico;
	}
	
	public String getTelefono() {
		return snumTelefonico;
	}
}