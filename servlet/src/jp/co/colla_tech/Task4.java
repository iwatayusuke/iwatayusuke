package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task4")
public class Task4 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();
        HtmlTemplate.header(out);
        out.println("<p>↓占い結果↓</p>");
        String kuji;
        Random r =new Random();
        String[] fortune = new String[]{"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
        kuji = fortune[r.nextInt(6)];
        out.println("<h1>" + kuji + "</h1>");
        HtmlTemplate.footer(out);
    }

}
