package services;
/*web service rest*/
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import domain.Person;
import dao.PersonDAO;

@Path("/person")
public class ServicePerson {
	
	private  PersonDAO dao ;

	public ServicePerson() {
		this.dao = new PersonDAO();
	}
	
	
	 	@GET
	    @Path("/")
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Person> getPersonnes() {
	        PersonDAO personDAO=new PersonDAO();
	        return  personDAO.readAll();
	    }

	
	 @GET 
	    @Path("/{id}")
	    @Produces({ MediaType.APPLICATION_JSON })
	    public Person findById(@PathParam("id") String pid) {
	        return dao.read(Long.parseLong(pid));
	    }
	 
	 @DELETE
	    @Path("/{id}")
	    @Produces({ MediaType.APPLICATION_JSON })
	    public String removePerson(@PathParam("id") String pid) {
			Person person= dao.read(Long.parseLong(pid));
			dao.delete(person);
		    return "deleted";
	    }

}
