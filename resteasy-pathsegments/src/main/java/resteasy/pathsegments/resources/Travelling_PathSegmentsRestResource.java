package resteasy.pathsegments.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;

@Path("/ps")
public class Travelling_PathSegmentsRestResource {
	
	@GET
	@Path("/resource/{segment}")
	@Produces(MediaType.TEXT_PLAIN)
	public String pathSegment(@PathParam("segment") PathSegment segmentPS) {
	//	http://localhost:8081/resteasy-pathsegments/rest/ps/resource/seg;dest=delhi
		String path = segmentPS.getPath();
		System.out.println(path);
		
		MultivaluedMap<String, String> matrixParameters = segmentPS.getMatrixParameters();
		System.out.println(matrixParameters.toString());
		System.out.println(matrixParameters.getFirst("dest"));
		List<String> list = matrixParameters.get("dest");
		System.out.println(list.toString());
		return "Success "+path + " "+matrixParameters.toString()+" "+list.toString();
	}
}
