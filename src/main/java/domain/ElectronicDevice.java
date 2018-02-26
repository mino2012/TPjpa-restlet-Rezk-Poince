package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("ElectronicDevice")
public class ElectronicDevice extends SmartDevice {
	
	private int nbDevice;
	private int consommation;
	public ElectronicDevice(int consommation, int nbDevice) {
		super();
		this.consommation = consommation;
		this.nbDevice = nbDevice;
	}
	
	public ElectronicDevice() {
		super();
	}

	public int getNbDevice() {
		return nbDevice;
	}
	public void setNbDevice(int nbDevice) {
		this.nbDevice = nbDevice;
	}
	
	public int getConsommation() {
		return consommation;
	}
	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}
	
	
}
