package jp.co.colla_tech;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Connection con = null;
        String iden = request.getParameter("id");
        int id = Integer.parseInt(iden);
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String nenrei = request.getParameter("age");
        int age = Integer.parseInt(nenrei);

        try {
            //JDBCドライバへの読み込み(MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1", "iwata", "iwata");
            System.out.println("DB接続が成功しました。" );

            //SQL文の実行
            String sql = "select name from employee where name like %?%";
            PreparedStatement ps = con.prepareStatement(sql);
            //条件の「?」に値を設定
            ps.setString(1,name);

            //SQL文の結果表を取得する
            ResultSet rs = ps.executeQuery();

            //結果表に格納された情報を表示
            System.out.println("検索結果");
            while(rs.next()) {
                System.out.println("ID：" + id);
                System.out.println("名前：" + name);
                System.out.println("誕生日：" + birthday);
                System.out.println("年齢：" + age);
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