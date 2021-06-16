package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submissions")
public class sendMessageServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String nameValue = request.getParameter("name-input");
    String emailValue = request.getParameter("email-input");
    String messageValue = request.getParameter("message-input");

    // Print the value so you can see it in the server logs.
    System.out.println(nameValue);
    System.out.println(emailValue);
    System.out.println(messageValue);

    // Write the value to the response so the user can see it.
    response.getWriter().println("You submitted: " + nameValue);
    response.getWriter().println("You submitted: " + emailValue);
    response.getWriter().println("You submitted: " + messageValue);
    response.sendRedirect("http://aramos-sps-summer21.appspot.com/submitted.html");
  }
}