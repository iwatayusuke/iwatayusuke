package jp.co.colla_tech;

import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/HtmlTemplate")
public class HtmlTemplate extends HttpServlet {

    private static String kuji;
    public static void header(PrintWriter out) {
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>ServletTask</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>↓占い結果↓</p>");
        out.println("</body>");
        out.println("</html>");
    }

    public static void footer(PrintWriter out) {
        out.println("<html>");
        out.println("<body>");
        Random r =new Random();
        String[] fortune = new String[]{"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
        kuji = fortune[r.nextInt(6)];
        out.println("<h1>" + kuji + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
