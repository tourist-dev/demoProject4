package com.example.demoProject4;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "view-records", value = "/view-records")
public class ViewServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        for (String record : Insurance.records)
            out.println("<h5>" + record + "<h5>");
        out.print("</body></html>");
    }
}
