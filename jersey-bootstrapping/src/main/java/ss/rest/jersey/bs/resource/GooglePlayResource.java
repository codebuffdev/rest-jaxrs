package ss.rest.jersey.bs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/gpay")
public class GooglePlayResource {
	@GET
	@Produces("text/plain")
	public String status(@QueryParam("userName") String userName) {
		return userName+" pending";
	}
}
