package com.randl.upload.resources.resources

import javax.ws.rs.core.{Response, Context, HttpHeaders}
import javax.ws.rs._
import scala.Array
import java.util.Locale
import javax.ws.rs.core.MediaType._
import com.randl.upload.resources.model.RentItem
import com.randl.upload.resources.Indexer

@Path("/search")
@Produces(Array(APPLICATION_JSON))
@Consumes(Array(APPLICATION_JSON))
class InsertItem extends Indexer {


  @POST
  @Path("-/insert/")
  def setItem(rentItem: RentItem) = {
    indexer(rentItem).execute().actionGet()
    Response.ok(rentItem.id).build()
  }


}
