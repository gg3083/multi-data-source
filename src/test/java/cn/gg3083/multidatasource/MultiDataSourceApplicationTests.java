package cn.gg3083.multidatasource;


import cn.gg3083.multidatasource.domain.Name;
import cn.gg3083.multidatasource.service.NameService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MultiDataSourceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private NameService nameService;

    @Test
    public void insert() {
        log.info("start insert");
        nameService.insert("insert");
    }

    @Test
    public void save() {
        log.info("start save");
        nameService.save("save");
    }

    @Test
    public void list() {
        log.info("start list");
        List<Name> names = nameService.selectAll();
        names.forEach( s-> System.err.println(s));
    }
    @Test
    public void getList() {
        log.info("start list");
        List<Name> names = nameService.getList();
        names.forEach( s-> System.err.println(s));
    }


}

