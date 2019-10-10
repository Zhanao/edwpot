package s07;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//tomcat riceve una richiesta, tom controlla se c'è app (edwpot) se si poi edwpot si va a penscare il servlet e il servlet mi genera la risposta,poi restituisce la risposta (formato html), il borwser rivece la risposta crea html dato che la respose è un html
@WebServlet("/s07/timer") //annotation che si applica alla classe che segue. quando faccio la request devo nominare questo nome
public class Timer extends HttpServlet { // un servlet che lavora su protocollo http
    private static final long serialVersionUID = 1L; // un qualsiasi oggetto della mia classe se serializzabile allora posso salvarlo su disco.
    												// o mandarli in giro

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) // mi gestisce le chiamate a get
            throws ServletException, IOException {
        response.setContentType("text/html"); // posso far ritornare qualsiasi tipo di file anche immagini audio etc
        response.setCharacterEncoding("utf-8");
        try (PrintWriter writer = response.getWriter()) { //scriviamo nella response
            writer.println("<!DOCTYPE html><html>");
            writer.println("<head><meta charset=\"utf-8\">");
            writer.println("<title>Hello Servlet</title></head>");
            writer.println("<body>");
            writer.println("<h1>" + LocalTime.now() + "</h1>"); //localtime è la classe moderna per gestire il tempo
            writer.println("<a href=\"..\">" + "back home" + "</a>");
            writer.println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) // mi gestisce le chiamate a post, se mi arriva un post  															
            throws ServletException, IOException {									//lo rimanda a doGet
        doGet(request, response);
    }
}
