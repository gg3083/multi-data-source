package cn.gg3083.multidatasource.mapper1;

import cn.gg3083.multidatasource.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author GG
 * @date 2019/1/23 19:12
 */
public interface UserMapper {

    void insert(@Param("userName") String userName , @Param("userPwd") String userPwd);

    List<User> selectAll();
}
