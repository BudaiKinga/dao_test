import java.sql.*;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private static final String CREATE_SCHEMA = "CREATE SCHEMA IF NOT EXISTS `dao_test`";
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS `dao_test`.`student` (\n" +
            "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `name` VARCHAR(45) NOT NULL,\n" +
            "  `birthdate` DATE NOT NULL,\n" +
            "  PRIMARY KEY (`id`))";

    private static final String INSERT = "INSERT INTO `student` (`name`, `birthdate`) VALUES (?, ?)";

    private final Connection connection;

    public StudentDaoImpl() throws SQLException {
        // acquire connection to DB
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", Credentials.USER, Credentials.PASSWORD);
        Statement statement = connection.createStatement();
        // create schema if not exists
        statement.execute(CREATE_SCHEMA);
        // will be working on 'dao_test'
        statement.execute("USE dao_test");
        // should create table if it does not already exist...
        statement.execute(CREATE_TABLE);
    }

    public Student find(int id) {
        return null;
    }

    public List<Student> findAll() {
        return null;
    }

    public void update(Student s) {

    }

    public void delete(Student s) {

    }

    public void insert(Student s) throws SQLException {
        final PreparedStatement statement = connection.prepareStatement(INSERT);
        statement.setString(1, s.getName());
        statement.setDate(2, s.getDateOfBirth());
        statement.executeUpdate();
    }
}
