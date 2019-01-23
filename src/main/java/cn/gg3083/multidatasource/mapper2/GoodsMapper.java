package cn.gg3083.multidatasource.mapper2;

import cn.gg3083.multidatasource.domain.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author GG
 * @date 2019/1/23 19:13
 */
public interface GoodsMapper {

    void insert(@Param("goodsName") String goodsName , @Param("goodsType") Integer goodsType ,@Param("goodsPrice") Double goodsPrice);

    List<Goods> selectAll();
}
