package lab.pkg10;

import java.util.Date;

public class MyEx extends Exception {
    Date throwDate;

    MyEx() {
        throwDate = new Date();
    }

    public Date getDate(String msg) {
        return throwDate;
    }

    public String getDangerLevel() {
        return "Безопасно";
    }

    public String toString(){
        return throwDate + "Собственное исключение MyException\n    Уровень опасности: " + getDangerLevel();
    }
}
