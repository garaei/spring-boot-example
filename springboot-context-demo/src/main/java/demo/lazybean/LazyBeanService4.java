package demo.lazybean;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zacconding
 * @Date 2018-08-28
 * @GitHub : https://github.com/zacscoding
 */
@Slf4j
public class LazyBeanService4 {

    @PostConstruct
    private void setUp() {
        log.info("## Create LazyBeanService4 in PostContruct");
    }

    public String getName() {
        return "LazyBeanService4";
    }
}