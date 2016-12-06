package com.hubio.integration.services.vehicle;

import com.hubio.integration.services.contracts.common.ContractResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Saradhi on 09/09/2016.
 */
public interface VehicleDetailsLookupService {

    @POST
    @Path("/retrieveVehicleDetails")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
    ContractResponse retrieveVehicleDetails(VehicleLookupRequest vehicleLookupRequest);
}
