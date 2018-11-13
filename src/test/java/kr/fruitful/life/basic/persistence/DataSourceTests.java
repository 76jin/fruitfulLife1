package kr.fruitful.life.basic.persistence;

import kr.fruitful.life.config.RootConfig;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.fail;

/**
 * Created by ranian129@gmail.com on 2018. 11. 13.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class DataSourceTests {

//    @Setter(onMethod_ = { @Autowired })
    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testConnection() {
        try (Connection con = dataSource.getConnection()) {
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testMyBatis() {
        try (SqlSession session = sqlSessionFactory.openSession();
             Connection con = session.getConnection();
        ) {
            log.info(session);
            log.info(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
