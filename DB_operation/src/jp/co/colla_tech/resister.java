package jp.co.colla_tech;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resister")
public class resister extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Connection con = null;
        String iden = request.getParameter("id");
        int id = Integer.parseInt(iden);
        String name = request.getParameter("name");
        String strBirthday = request.getParameter("birthday");
        Date birthday = Date.valueOf(strBirthday);
        String nenrei = request.getParameter("age");
        int age = Integer.parseInt(nenrei);

        try {
            //JDBCドライバへの読み込み(MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?useUnicode=true&characterEncoding=utf8", "iwata", "iwata");
            System.out.println("DB接続が成功しました。" );

            //SQL文の実行
            String sql = "insert into employee(id, name, birthday, age) values(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            //条件の「?」に値を設定
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setDate(3,birthday);
            ps.setInt(4,age);

            //insertした件数を取得する
            ps.executeUpdate();

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
