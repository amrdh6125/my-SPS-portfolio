package com.google.sps.servlets;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.cloud.datastore.Query;
import com.google.cloud.datastore.QueryResults;
import com.google.cloud.datastore.StructuredQuery.OrderBy;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/messages")
public class loadMessage extends HttpServlet
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
  {  
    //Load from Datastore
    Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
    Query<Entity> query =
        Query.newEntityQueryBuilder().setKind("Task").setOrderBy(OrderBy.desc("name")).build();
    QueryResults<Entity> results = datastore.run(query);

    List<String[]> dataMessages = new ArrayList<>();
    while (results.hasNext()) 
    {
      Entity entity = results.next();

      String nameLoad = entity.getString("name");
      String emailLoad = entity.getString("email");
      String messageLoad = entity.getString("message");
      
      String[] dm = {"Name: " + nameLoad, "Message: " + messageLoad +
      "\n____________________________________________________________________________\n"};
      
      dataMessages.add(dm); 
    }

    Gson gson = new Gson();

    response.setContentType("application/json;");
    response.getWriter().println(gson.toJson(dataMessages));
  }
}