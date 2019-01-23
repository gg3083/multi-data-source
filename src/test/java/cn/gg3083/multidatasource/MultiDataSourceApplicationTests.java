package cn.gg3083.multidatasource;

import cn.gg3083.multidatasource.domain.Goods;
import cn.gg3083.multidatasource.domain.User;
import cn.gg3083.multidatasource.mapper2.GoodsMapper;
import cn.gg3083.multidatasource.mapper1.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiDataSourceApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    UserMapper userMapper;

   @Test
   public void test1(){
       userMapper.insert( "2","2");
       List<User> list = userMapper.selectAll();

       list.forEach( s -> System.err.println( s ));
   }

   @Autowired
    GoodsMapper goodsMapper;
    @Test
    public void test2(){
        goodsMapper.insert( "2",2,1.0);
        List<Goods> list = goodsMapper.selectAll();

        list.forEach( s -> System.err.println( s ));
    }
}

