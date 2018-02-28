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
        p.setNom("tito");
        p.setMail("pal@gmail.com");
        p.setPrenom("paris");
System.out.println("Salut");
        HomeDAO daoh =new HomeDAO();
        Home home =new Home();
        home.setNbpieces(10);
        home.setTaille(32);
        
        HeaterDAO hdao= new HeaterDAO();
        Heater heater= new Heater();
        heater.setNbchauffages(30);
        heater.setTemperature(20);
        
        ElectronicDeviceDAO edao=new ElectronicDeviceDAO();
        ElectronicDevice device=new ElectronicDevice();
        device.setNbDevice(1);
        device.setName("test");
        
        home.setPerson(p);
        device.setHome(home);
        heater.setHome(home);
        dao.create(p);
        daoh.create(home);
        hdao.create(heater);
        edao.create(device);
    }


}
