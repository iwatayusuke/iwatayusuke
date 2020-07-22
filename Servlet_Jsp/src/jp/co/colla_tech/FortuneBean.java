package jp.co.colla_tech;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable{

    // privateなフィールド
    private Date today = new Date();
    private String fortune = "";

    public FortuneBean() {} //引数なしのコンストラクタ

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public String getFortune() {
        return fortune;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }

}
