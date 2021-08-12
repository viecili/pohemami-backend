package com.ibm.techgarage.cnb.pohemami.backend;

import com.ibm.techgarage.cnb.pohemami.backend.beans.RandomName;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/randomnames")
public interface RandomnamesResource {
  /**
   * Gets a list of all `RandomName` entities.
   */
  @GET
  @Produces("application/json")
  List<RandomName> getRandomNames(@QueryParam("size") Integer size);

  /**
   * Creates a new instance of a `RandomName`.
   */
  @POST
  @Consumes("application/json")
  void createRandomName(@QueryParam("size") Integer size, RandomName data);

  /**
   * Gets the details of a single instance of a `RandomName`.
   */
  @Path("/{randomnameId}")
  @GET
  @Produces("application/json")
  RandomName getRandomName(@PathParam("randomnameId") String randomnameId);

  /**
   * Updates an existing `RandomName`.
   */
  @Path("/{randomnameId}")
  @PUT
  @Consumes("application/json")
  void updateRandomName(@PathParam("randomnameId") String randomnameId, RandomName data);

  /**
   * Deletes an existing `RandomName`.
   */
  @Path("/{randomnameId}")
  @DELETE
  void deleteRandomName(@PathParam("randomnameId") String randomnameId);
}
