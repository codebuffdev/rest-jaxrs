package ss.rest.jersey.subresourcelocator.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class DellPersonalService {

	@GET
	@Path("/personal/{model}")
	@Produces(MediaType.TEXT_PLAIN)
	public String warrenty(@PathParam("model") String model) {
		if (model.equals("delli"))
			return "10";
		else
			return "1";
		
	}
}
