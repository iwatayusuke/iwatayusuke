package jp.co.colla_tech;

import java.io.IOException;
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
            System.out.println("検索結果");
            while(rs.next()) {
                int iden = rs.getInt("id");
                System.out.println("ID：" + iden);
                String simei = rs.getString("name");
                System.out.println("名前：" + simei);
                Date tanjoubi = rs.getDate("birthday");
                System.out.println("誕生日：" + tanjoubi);
                int nenrei = rs.getInt("age");
                System.out.println("年齢：" + nenrei);
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