package mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediator{
	ArrayList<SmartDevice> smartdevices = new ArrayList<>();
	
	@Override
	void registra(SmartDevice smartdevice) {
		if(!smartdevices.contains(smartdevice)) {
			smartdevices.add(smartdevice);
			smartdevice.setMediator(this);
		}
	}

	@Override
	void reenvia(SmartDevice smartdevice) {
		for(SmartDevice actual : smartdevices) {
			if(!actual.equals(smartdevice)) {
			actual.recibe();
			}
		}		
	}
}

