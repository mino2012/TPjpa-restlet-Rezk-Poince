package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Heater")
public class Heater extends SmartDevice{
	
	private int nbchauffages;
	private int temperature;
	private String power;

	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public Heater() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Heater(int nbchauffages,int temperature,String power) {
		super();
		this.nbchauffages= nbchauffages;
		this.temperature= temperature;
		this.power=power;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getNbchauffages() {
		return nbchauffages;
	}
	public void setNbchauffages(int nbchauffages) {
		this.nbchauffages = nbchauffages;
	}
	
}
