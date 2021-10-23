package ss.rest.jersey.subresourcelocator.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dell")
public class DellService {
	
	@Path("/laptop/warrenty")
	public DellPersonalService perosnalServices() {
		return new DellPersonalService();
	}
	
	
	@GET
	@Path("/laptop/{model}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getProductDetails(@PathParam("model") String model) {
		 if(model.equals("mac"))
			 return "\r\n"
				+ "Model Name	MacBook Pro\r\n"
				+ "Brand	Apple\r\n"
				+ "Specific Uses For Product	Multimedia\r\n"
				+ "Screen Size	13.3 Inches\r\n"
				+ "Operating System	MacOS 10.14 Mojave\r\n"
				+ "CPU Manufacturer	Apple\r\n"
				+ "Special Feature	Fingerprint reader\r\n"
				+ "Colour	Space Grey\r\n"
				+ "Processor Count	8\r\n"
				+ "Graphics Processor Manufacturer	Apple";
			else 
				return "baskwas laptop";
	}
	
	
}
