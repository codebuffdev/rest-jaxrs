package ss.jersey.ctc.resources;

import ss.jersey.ctc.helper.ReferenceNo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/parcel")
public class ParcelTracking {
    @GET
    @Path("/track/{refNo}")
    @Produces(MediaType.TEXT_PLAIN)
    public String info(@PathParam("refNo")ReferenceNo referenceNo){
        return referenceNo.toString();
    }
}
