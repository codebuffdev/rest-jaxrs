package ss.rest.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/path/{nm}")
public class PathScopeResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/get")
	public StreamingOutput getSomething(@PathParam("nm") String nm) {
		return (out)->{out.write(("haha gotta u " +nm).getBytes());};
	}
	 
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/gett/{nm}")
	public StreamingOutput get(@PathParam("nm") String nm) {
		return (out)->{out.write(("haha gotta u " +nm).getBytes());};		
	}
	
}
