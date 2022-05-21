package mediator;

public abstract class SmartDevice {

	double pulg_pantalla;
	boolean tactil;
	public Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	abstract void recibe();
	abstract void envia();
}
