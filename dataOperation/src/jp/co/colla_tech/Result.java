package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String gen = request.getParameter("gender");
        String gender = "";
        String sel = request.getParameter("select");
        String select = "";
        String textBox = request.getParameter("textbox");

        if("0".equals(gen)){
            gender = "男";
        }else if("1".equals(gen)) {
            gender = "女";
        }

        if("0".equals(sel)){
            select = "製品について";
        }else if("1".equals(sel)) {
            select = "不具合やクレーム";
        }else if("2".equals(sel)) {
            select = "アフターサポート";
        }

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>お問い合わせを受け付けました</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>" + "以下の内容でお問い合わせしました。回答をお待ちください。" + "</p>");
        out.println("<p>名前：" + name + "様" + "</p>");
        out.println("<p>性別：" + gender + "</p>");
        out.println("<p>お問い合わせ種類:" + select + "</p>");
        out.println("<p>お問い合わせ内容:" + textBox + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

}
