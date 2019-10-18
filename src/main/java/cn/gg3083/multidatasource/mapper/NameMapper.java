package cn.gg3083.multidatasource.mapper;

import cn.gg3083.multidatasource.domain.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Gimi
 * @date 2019/10/18 14:46
 */
@Mapper
public interface NameMapper {

    int insert(@Param("name") String name);

    List<Name> selectAll();
}
