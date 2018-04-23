package com.integ.integration.services.vehicle.api;

import org.apache.camel.Header;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Saradhi on 09/09/2016.
 */
public interface VehicleDetailsLookupService {

    @POST
    @Path("/retrieveVehicleDetails")
    @Consumes({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    AbstractVehicleLookupResponse retrieveVehicleDetails(VehicleLookupRequest vehicleLookupRequest);

    @GET
    @Path("/retrieveVehicleDetails/{vrm}")
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    AbstractVehicleLookupResponse retrieveVehicleDetails(@PathParam("vrm") @Header("vrm") String vrm);
}
