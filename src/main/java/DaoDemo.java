import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

public class DaoDemo {

    public static void main(String[] args) throws SQLException {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1993);
        cal.set(Calendar.DAY_OF_MONTH, 4);
        cal.set(Calendar.MONTH, Calendar.NOVEMBER);

        final StudentDao dao = new StudentDaoImpl();
        dao.insert(new Student("Kobold", new Date(cal.getTime().getTime() )));
    }
}
