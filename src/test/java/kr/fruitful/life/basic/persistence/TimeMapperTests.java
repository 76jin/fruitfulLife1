package kr.fruitful.life.basic.persistence;

import kr.fruitful.life.basic.mapper.TimeMapper;
import kr.fruitful.life.config.RootConfig;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ranian129@gmail.com on 2018. 11. 13.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {kr.fruitful.life.config.RootConfig.class})
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class TimeMapperTests {

    @Autowired
//    @Setter(onMethod_ = @Autowired)
    private TimeMapper timeMapper;

    @Test
    public void testGetTime() {
        log.info(timeMapper.getClass().getName());
        log.info(timeMapper.getTime());
    }

    @Test
    public void testGetTime2() {
        log.info("test getTime2...");
        log.info(timeMapper.getTime2());
    }
}
