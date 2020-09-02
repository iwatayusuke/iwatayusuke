package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Connection con = null;
        String name = request.getParameter("name");

        try {
            //JDBCドライバへの読み込み(MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?useUnicode=true&characterEncoding=utf8", "iwata", "iwata");
            System.out.println("DB接続が成功しました。" );

            //SQL文の実行
            String sql = "select * from employee where name like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            //条件の「?」に値を設定
            ps.setString(1,"%" + name + "%");

            //SQL文の結果表を取得する
            ResultSet rs = ps.executeQuery();

            //結果表に格納された情報を表示
            while(rs.next()) {
                response.setContentType("text/html; charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head>");
                out.println("<meta charset='UTF-8'>");
                out.println("<title>検索結果</title>");
                out.println("</head>");
                out.println("<body>");
                int iden = rs.getInt("id");
                out.println("<p>ID：" + iden +  "</p>");
                String simei = rs.getString("name");
                out.println("<p>名前：" + simei +  "</p>");
                Date tanjoubi = rs.getDate("birthday");
                out.println("<p>" + tanjoubi +  "</p>");
                int nenrei = rs.getInt("age");
                out.println("<p>年齢：" + nenrei +  "</p>");
                out.println("</body>");
                out.println("</html>");
            }

            //使用が終わったら切断
            ps.close();
        }catch(SQLException e) {
            //DB接続やSQL処理の失敗時の処理
            e.printStackTrace();
        }catch(ClassNotFoundException e) {
            //JDBCドライバが見つからない時の処理
            e.printStackTrace();
        }finally {
            //データベースの切断
            if(con != null) {
                try {
                    con.close();
                }catch(SQLException e) {
                    //DB切断失敗時の処理
                    e.printStackTrace();
                }
            }
        }

    }

}