package jpa;

import dao.ElectronicDeviceDAO;
import dao.HeaterDAO;
import dao.HomeDAO;
import dao.PersonDAO;
import domain.ElectronicDevice;
import domain.Heater;
import domain.Home;
import domain.Person;

public class JpaTest {

    /**
     * @param args
     */

    public static void main(String[] args) {


        PersonDAO dao = new PersonDAO();
        Person p = new Person();
        p.setNom("thomas");
        p.setMail("thomas@gmail.com");
        p.setPrenom("tata");

        HomeDAO daoh =new HomeDAO();
        Home home =new Home();
        home.setNbpieces(5);
        home.setTaille(20);
        
        HeaterDAO hdao= new HeaterDAO();
        Heater heater= new Heater();
        heater.setNbchauffages(4);
        heater.setTemperature(20);
        
        ElectronicDeviceDAO edao=new ElectronicDeviceDAO();
        ElectronicDevice device=new ElectronicDevice();
        device.setNbDevice(1);
        device.setName("alarme");
        
        home.setPerson(p);
        device.setHome(home);
        device.setPerson(p);
        heater.setHome(home);
        heater.setPerson(p);
        dao.create(p);
        daoh.create(home);
        hdao.create(heater);
        edao.create(device);
    }


}
