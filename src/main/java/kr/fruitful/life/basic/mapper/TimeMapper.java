package kr.fruitful.life.basic.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by ranian129@gmail.com on 2018. 11. 13.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Mapper
@Repository
public interface TimeMapper {

    @Select("select sysdate from dual")
    String getTime();

    String getTime2();
}
