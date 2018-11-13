import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.fail;

/**
 * Created by ranian129@gmail.com on 2018. 11. 13.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Log4j
public class JDBCTests {

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        try (Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "id",
                "pw"
        )) {
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
