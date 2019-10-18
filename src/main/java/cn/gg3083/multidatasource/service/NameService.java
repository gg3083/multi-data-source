package cn.gg3083.multidatasource.service;

import cn.gg3083.multidatasource.annotation.Master;
import cn.gg3083.multidatasource.domain.Name;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Gimi
 * @date 2019/10/18 14:45
 */
public interface NameService {

    int insert(String name);

    @Master
    int save(String name);

    List<Name> selectAll();

    @Master
    List<Name> getList();

//    @Master
//    String getToken(String appId);
}
