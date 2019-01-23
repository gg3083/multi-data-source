package cn.gg3083.multidatasource.controller;

import cn.gg3083.multidatasource.domain.User;
import cn.gg3083.multidatasource.mapper1.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author GG
 * @date 2019/1/23 19:26
 */
@RestController
public class TestController {

    @Autowired
    UserMapper userMapper;

    @GetMapping
    public List<User> list(){
        return userMapper.selectAll();
    }
}
