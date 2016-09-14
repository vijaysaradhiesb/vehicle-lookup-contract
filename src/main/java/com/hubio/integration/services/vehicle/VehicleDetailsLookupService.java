package com.hubio.integration.services.vehicle;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Saradhi on 09/09/2016.
 */
public interface VehicleDetailsLookupService {

    @POST
    @Path("/retrieveVehicleDetails")
    @Consumes({"text/xml"})
    @Produces({"text/xml"})
    VehicleLookupResponse  retrieveVehicleDetails(VehicleLookupRequest vehicleLookupRequest);
}
