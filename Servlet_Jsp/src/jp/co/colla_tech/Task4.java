package jp.co.colla_tech;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task4
 */
@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset = UTF-8");

        Date today = new Date();
        Random r =new Random();
        String[] fortune = new String[]{"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
        String kuji = fortune[r.nextInt(6)];

        FortuneBean fortunebean = new FortuneBean();
        fortunebean.setToday(today);
        fortunebean.setFortune(kuji);
        request.setAttribute("fortuneResult", fortunebean);

        request.getRequestDispatcher("WEB-INF/jsp/fortune_result.jsp").forward(request, response);
    }

}
