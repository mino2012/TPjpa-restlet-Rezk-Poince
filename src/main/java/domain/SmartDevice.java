package domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeAppareil",discriminatorType=DiscriminatorType.STRING,length=25)
public class SmartDevice {
    private String name;
    @ManyToOne
    private Home home;
    @ManyToOne
    Person person;
    
    
    public SmartDevice() {
		// TODO Auto-generated constructor stub
	}

	public SmartDevice(String name, Home home) {
		
		this.name = name;
		this.home = home;
		//this.person= person;
	}
    public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Id
    @GeneratedValue
    private long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}
	


}
