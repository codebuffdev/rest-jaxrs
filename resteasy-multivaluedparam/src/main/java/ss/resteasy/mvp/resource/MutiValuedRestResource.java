package ss.resteasy.mvp.resource;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/multi")
public class MutiValuedRestResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/get")
	public String get(@MatrixParam("places") List<String> places,@QueryParam("days") List<Integer> days) {
		StringBuilder sb = new StringBuilder();
		for (String string : places) {
			sb.append(string).append(" ");
		}
		for(Integer it:days){
			sb.append(it).append(" ");
		}
		return sb.toString();
	}
}
