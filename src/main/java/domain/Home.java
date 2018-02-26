package domain;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Home {
	Long id;
	double taille;
	int nbpieces;
	Person person;
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private List<SmartDevice> Appareil = new ArrayList<SmartDevice>();
	
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public int getNbpieces() {
		return nbpieces;
	}
	public void setNbpieces(int nbpieces) {
		this.nbpieces = nbpieces;
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@OneToMany(mappedBy = "home")
	public List<SmartDevice> getAppareil() {
		return Appareil;
	}
	public void setAppareil(List<SmartDevice> appareil) {
		Appareil = appareil;
	}
	@ManyToOne
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
