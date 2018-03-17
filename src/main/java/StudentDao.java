import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

    Student find(final int id);

    List<Student> findAll();

    void update(Student s);

    void delete(Student s);

    void insert(Student s) throws SQLException;
}