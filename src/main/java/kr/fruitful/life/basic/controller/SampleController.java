package kr.fruitful.life.basic.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by ranian129@gmail.com on 2018. 11. 12.
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
//@Log4j
@Controller
public class SampleController {

    @GetMapping("/doA")
    public void doA() {
//        log.info("## doA called....");
//        log.info("-----------------");
        System.out.println("## doA called...");
        System.out.println("----------------");
    }
}
