package com.paytm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/paytmwallet")
public class PaytmWalletResource {

	@GET
	@Produces("text/plain")
	public double getWalletBalance(@QueryParam("mobileNo") String mobileNo) {
		// business and persistence logic in fetching the balance of the wallet based on
		// mobileNo and return to the Client Program
		return 3939;
	}
}
