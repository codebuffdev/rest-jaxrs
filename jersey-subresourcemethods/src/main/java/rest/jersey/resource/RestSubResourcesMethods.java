package rest.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/subresource")
public class RestSubResourcesMethods { //rootResource class
	
	@GET 
	@Path("/add") //sub-resource method
	@Produces(MediaType.TEXT_PLAIN)
	public String admission(@QueryParam("admissionNumber") int admissionNumber) {
		return "pending " + admissionNumber;
	}
	
	@GET
	@Path("/dept") //sub-resource method
	@Produces(MediaType.TEXT_PLAIN)
	public String fees(@QueryParam("dept")String dept) {
		return "free";
	}

	
	@POST  //resource method 
	@Produces(MediaType.TEXT_PLAIN)
	public String apply() {
		return "pending";
	}
}
