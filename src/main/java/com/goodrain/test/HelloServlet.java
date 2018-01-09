package com.goodrain.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("----------------");
		response.setContentType("text/plain");
		response.setStatus(200);
		PrintWriter out = response.getWriter();
    out.println("System Environment:\n");
    for (Map.Entry<String, String> envvar : System.getenv().entrySet()) {
        out.println(envvar.getKey() + ": " + envvar.getValue());
    }
		out.close();
	}
}
