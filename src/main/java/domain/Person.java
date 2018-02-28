package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
public class Person {
	
	private String nom;
	private String prenom;
	private String mail;
	private List<Home> residence = new ArrayList<Home>();
	private List<SmartDevice> devices = new ArrayList<SmartDevice>();
	private List<Person> friends = new ArrayList<Person>();
	private Long id;
	
	public Person(String nom, String prenom, String mail) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		
		this.residence=new ArrayList<Home>();
		this.devices=new ArrayList<SmartDevice>();
		this.friends= new ArrayList<Person>();
	}
	public Person() {
		this.residence=new ArrayList<Home>();
		this.devices=new ArrayList<SmartDevice>();
		this.friends= new ArrayList<Person>();
	}
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(length=100)
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column(length=100)
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Column(length=100)
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Column(length=100)
	@OneToMany(mappedBy = "person")
	@JsonIgnore
	public List<Home> getResidence() {
		return residence;
	}
	public void setResidence(List<Home> residence) {
		this.residence = residence;
	}
	@Column(length=100)
	@OneToMany(mappedBy = "person")
	public List<SmartDevice> getDevices() {
		return devices;
	}

	public void setDevices(List<SmartDevice> devices) {
		this.devices = devices;
	}
	
	@ManyToMany
    public List<Person> getFriends() {
        return friends;
    }
	@ManyToMany
    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

}
