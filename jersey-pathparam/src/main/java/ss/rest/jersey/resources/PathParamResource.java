package ss.rest.jersey.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/path")
public class PathParamResource {
		//  fixedPath   dynamicPath 
	@Path("/restaurant/{loc}/{type}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public String show(@PathParam("loc") String location,@PathParam("type") String type) {	
		System.out.println(hashCode());
		return new StringBuilder().append(location).append(" ").append(type).toString();
	}
}
