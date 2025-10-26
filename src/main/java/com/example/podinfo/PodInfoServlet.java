package com.example.podinfo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.InetAddress;

public class PodInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String hostname = InetAddress.getLocalHost().getHostName();
        String ip = InetAddress.getLocalHost().getHostAddress();

        out.println("<html><body style='font-family: Arial;'>");
        out.println("<h2>Pod Info</h2>");
        out.println("<p><b>Hostname:</b> " + hostname + "</p>");
        out.println("<p><b>IP Address:</b> " + ip + "</p>");
        out.println("</body></html>");
    }
}
