package kr.fruitful.life.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by ranian129@gmail.com on 2018. 11. 12.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Configuration
@ComponentScan(basePackages = { "kr.fruitful.life" })
@MapperScan(basePackages = {"kr.fruitful.life.basic.mapper"})
public class RootConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
//        hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//        hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
        hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
        hikariConfig.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@localhost:1521:XE");

        hikariConfig.setUsername("id");
        hikariConfig.setPassword("pw");

        return new HikariDataSource(hikariConfig);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }

}
