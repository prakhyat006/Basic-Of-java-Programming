package com.prime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html>");
            out.println("<head><title>Prime Result</title></head>");
            out.println("<body style='font-family: Arial; margin: 30px;'>");
            out.println("<h2>Prime Number Checker</h2>");
            out.println("<p>Number entered: <strong>" + number + "</strong></p>");
            if (isPrime) {
                out.println("<p style='color: green;'><strong>" + number + " is a Prime Number.</strong></p>");
            } else {
                out.println("<p style='color: red;'><strong>" + number + " is NOT a Prime Number.</strong></p>");
            }
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body>");
            out.println("</html>");

        } catch (NumberFormatException e) {
            out.println("<h3 style='color:red;'>Invalid input. Please enter a valid integer.</h3>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
