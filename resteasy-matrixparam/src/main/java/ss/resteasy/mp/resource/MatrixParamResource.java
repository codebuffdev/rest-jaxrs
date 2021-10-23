package ss.resteasy.mp.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/matrix")
public class MatrixParamResource {
	@GET
	@Path("/get/{path}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllSendParams(@PathParam("path") String path,@MatrixParam("max") String max) {
		return new StringBuffer().append(path).append(" ").append(max).toString();
	}
	
	@GET
	@Path("/work")
	@Produces(MediaType.TEXT_PLAIN)
	public String status() {
		return "Working";
	}
}
