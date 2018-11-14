package kr.fruitful.life.basic.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ranian129@gmail.com on 2018. 11. 13.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@Data
public class SampleDTOList {

    private List<SampleDTO> list;

    public SampleDTOList() {
        if (list == null) {
            this.list = new ArrayList<>();
        }
    }
}
