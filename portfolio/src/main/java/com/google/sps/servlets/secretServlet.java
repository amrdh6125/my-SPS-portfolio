package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/scram")
public class secretServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        //String
        String[] clicked = {"What did you gain from doing this?", "Read what the button says again.", "You really don't like following instructions."};

        //Convert to json
        String json = convertToJson(clicked);
        response.setContentType("application/json");
        response.getWriter().println(json);
    }

    private String convertToJson(String[] clicked)
    {
        String json = "{";
        json += "\"Message1\": ";
        json += "\"" + clicked[0] + "\"";
        json += ", ";
        json += "\"Message2\": ";
        json += "\"" + clicked[1] + "\"";
        json += ", ";
        json += "\"Message3\": ";
        json += "\"" + clicked[2] + "\"";
        json += "}";
        return json;
    } 
}