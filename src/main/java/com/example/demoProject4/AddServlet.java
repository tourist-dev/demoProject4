package com.example.demoProject4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        Insurance.records.add(request.getParameter("id" +
                ", " + request.getParameter("pnum") + ", " +
                request.getParameter("peffdate") + ", " +
                request.getParameter("pexpdate") + ", " +
                request.getParameter("payment") + ", " +
                request.getParameter("total") + ", " +
                request.getParameter("active") + ", " +
                request.getParameter("date")));
        out.print("added");
        out.print("</body></html>");
    }
}
